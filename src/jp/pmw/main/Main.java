package jp.pmw.main;

import java.sql.Connection;
import java.sql.SQLException;

import jp.pmw.academiccalendar.AcademicCalendar;
import jp.pmw.idlink.register.BelongDeptPersonRegist;
import jp.pmw.idlink.register.RoomMstRegist;
import jp.pmw.idlink.register.StaffMstRegist;
import jp.pmw.migration.university_core_data.Migration;
import jp.pmw.mysql.ConectObject;
import jp.pmw.mysql.Connect;

public class Main {

	public static void main(String[] args) {
		ConectObject conObj = new ConectObject();
		conObj.setHost("127.0.0.1");
		conObj.setDb("catalunya_3");
		conObj.setUsr("root");
		conObj.setPassWord("");

		try {
			//コネクション生成
			Connect.getInstance().setConnection(conObj);
			Connection con = Connect.getInstance().getConnection();

			new Migration();

			new RoomMstRegist();

			new StaffMstRegist();

			new BelongDeptPersonRegist();

			new AcademicCalendar();


		} catch (SQLException e) {
			System.out.println("Errorr SQLException:"+e);
		}

	}
}
