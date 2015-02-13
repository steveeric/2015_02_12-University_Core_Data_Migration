package jp.pmw.migration.university_core_data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.pmw.mysql.Connect;
import jp.pmw.sitandgo.config.MyConfig;
import jp.pmw.util.error.UtilError;

public class RandomGenerator {
	private List<String> usedRangomNo;
	RandomGenerator(String tmpTableName){
		try {
			this.usedRangomNo = getBeingUsedRandomNo(tmpTableName);
		} catch (SQLException e) {
			UtilError.getInstance().showError(e.getCause());
		}
	}

	public List<String> getBeingUsedRandomNo(String tempMasterTableName) throws SQLException {
		List<String> randomNo = new ArrayList<String>();
		String sql = "SELECT `TMP_RANDOM_NO` FROM `"+tempMasterTableName+"`";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			ps = Connect.getInstance().getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				randomNo.add(rs.getString("TMP_RANDOM_NO"));
			}
		} finally {
			if(ps != null){
				ps.close();
			}
			if(rs != null){
				rs.close();
			}
		}
		return randomNo;
	}

	public String createRandomRandomNo() throws SQLException {
		//乱数被りを防止するために、
		//点在のTEMPテーブルで使用されているTEMP_RANDOM_NOを取得する
		String newRandomNo = null;
		boolean flag = false;
		while(!flag){
			newRandomNo = createRandomNo();
			boolean usedFlag = usedRangomNo.contains(newRandomNo);
			if(usedFlag == false){
				usedRangomNo.add(newRandomNo);
				flag = true;
			}
		}
		return newRandomNo;
	}
	private String createRandomNo() {
		String strRand = new String();
		for(int i=0; i<MyConfig.DIGIT_TEMP_RANDOM_NO; i++){
			strRand += String.valueOf((int)(Math.random()*10));
		}
		return strRand;
	}


}
