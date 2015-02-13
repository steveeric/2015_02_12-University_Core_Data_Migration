package jp.pmw.migration.university_core_data;

import java.io.File;
import java.util.List;
import jp.pmw.log.MyLog;
import jp.pmw.mysql.Connect;
import com.jenkov.db.PersistenceManager;
import com.jenkov.db.itf.IDaos;
import com.jenkov.db.itf.PersistenceException;

/**
 * createdate : 2015年2月4日
 * 大学基幹システムから出力された
 * CSVファイルを読み込み、
 * 目的の各TEMPテーブルにインサート&CSVを
 * ファイル移動するまで行います
 * @author Shota Ito.
 */
public class ReadingCsvMst<T> implements ReadingCsvInterface<T>{
	//DBへインサートする用のORMクラス
	public Class<T> clazz;

	private String giveMasterCsvName;

	//DBインサートマッパ
	public PersistenceManager manager;
	/**
	 *
	 * s
	 *
	 * **/
	public ReadingCsvMst(Class<T> clazz){
		this.clazz = clazz;
		this.manager = new PersistenceManager();
	}


	@Override
	public void moveCsvFile(String orijinalCsvPath,String moveCsvPath) {
		// TODO 自動生成されたメソッド・スタブ
		/*String f = this.csvFolderAbsolutePath + giveMasterCsvName;
		File file = new File(f);
		String giveRenameMasterCsvName = giveDirectory(System.currentTimeMillis() + "_" +this.masterCsvName);
		String re = this.usedFolderAbsolutePath + giveRenameMasterCsvName;
		File fileRename = new File(re);*/

		MyLog.getInstance().info("「"+orijinalCsvPath+"」から、「"+moveCsvPath+"」にファイル移動します.");
		boolean moveResultFlag =  new File(orijinalCsvPath).renameTo(new File(moveCsvPath));
		if(moveResultFlag == false){
			MyLog.getInstance().error("ファイル移動に失敗しました.");
		}else{
			MyLog.getInstance().info("ファイル移動に成功しました.");
		}
	}

	public String giveDirectory(String fileName){
		return "\\" + fileName;
	}



	@Override
	public void insertTmpDate(List<T> tmpList) throws PersistenceException {
		// TODO 自動生成されたメソッド・スタブ
		MyLog.getInstance().info("マスターCSVに「"+tmpList.size()+"」件のレコードを確認しました.");
		//DBインサートマッパ
		IDaos daos = null;
		int insertCount = 0;
		for(int i = 0; i < tmpList.size(); i++){
			++insertCount;
			daos = manager.createDaos(Connect.getInstance().getConnection());
			int insertResult = daos.getObjectDao().insert(tmpList.get(i));
			if(insertResult == 0){
				//インサート処理失敗
				MyLog.getInstance().error(insertCount+"レコードのインサート処理が失敗しました.");
			}
		}
		MyLog.getInstance().info("全「"+insertCount+"」件のレコードをインサートしました.");
	}

}