package jp.pmw.migration.university_core_data;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jenkov.db.itf.PersistenceException;

import jp.pmw.log.MyLog;
import jp.pmw.migration.object.ClassSchedule;
import jp.pmw.migration.object.Faculty;
import jp.pmw.migration.object.Room;
import jp.pmw.migration.object.Staff;
import jp.pmw.migration.object.Student;
import jp.pmw.migration.tmp.TMP_CLASS_SCHEDULE_MST;
import jp.pmw.migration.tmp.TMP_FACULTY_MST;
import jp.pmw.migration.tmp.TMP_ROOM_MST;
import jp.pmw.migration.tmp.TMP_STAFF_MST;
import jp.pmw.migration.tmp.TMP_STUDENT_MST;
import jp.pmw.parser.CsvParser;
import jp.pmw.sitandgo.config.MyConfig;
import jp.pmw.util.error.UtilError;

public class Migration {


	/*private String[] MASTER_CSV_LIST = {
			MyConfig.CSV_ROOM_MST,
			MyConfig.CSV_STUDENT_MST,
			MyConfig.CSV_STAFF_MST,
			MyConfig.CSV_FACULTY_MST,
			MyConfig.CSV_ACADEMIC_CALENDAR_MST,
			MyConfig.CSV_TIMETABsLE_MST,
			MyConfig.CSV_REGISTRATION_MST
	};*/
	private String[] MASTER_CSV_LIST = {
			MyConfig.CSV_ROOM_MST,
			MyConfig.CSV_STUDENT_MST,
			MyConfig.CSV_STAFF_MST,
			MyConfig.CSV_FACULTY_MST,
			MyConfig.CSV_TIMETABLE_MST
	};

	/*private String[] TEMP_MASTER_TABLE_LIST ={
			MyConfig.DB_TABLE_TEMP_ROOM_MST,
			MyConfig.DB_TABLE_TEMP_STUDENT_MST,
			MyConfig.DB_TABLE_TEMP_STAFF_MST,
			MyConfig.DB_TABLE_TEMP_YEARSCHEDULE_MST,
			MyConfig.DB_TABLE_TEMP_CLASS_SCHEDULE_MST
	};*/


	/*
	private String[] MASTER_CSV_LIST = {
			MyConfig.CSV_STAFF_MST
	};
	private String[] TEMP_MASTER_TABLE_LIST ={
			MyConfig.DB_TABLE_TEMP_STAFF_MST
	};
	 */

	public Migration(){
		try {
			startProcess();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			MyLog.getInstance().error(e.getMessage());
		} catch (PersistenceException e) {
			UtilError.getInstance().showError(e.getCause());
		} catch (SQLException e) {
			MyLog.getInstance().error(e.getMessage());
		}
	}

	private void startProcess() throws IOException, PersistenceException, SQLException{
		//CSV解析クラス
		CsvParser parser = null;
		String orijinalPath = MyConfig.PATH_INPUT_CSV;
		String movePath = MyConfig.PATH_USED;

		for(int i = 0; i < MASTER_CSV_LIST.length; i++){

			boolean fileExsitFlag = false;

			String masterCsvName = MASTER_CSV_LIST[i];
			String orijinalCsvPath = orijinalPath + "\\";
			String moveCsvPath = movePath + "\\";


			ReadingCsvMst mst = null;
			RandomGenerator randGenerator = null;

			MyLog.getInstance().info(masterCsvName+"の機能を取得します.");

			if(MyConfig.CSV_ROOM_MST.equals(masterCsvName)){
				//ROOM_MST.CSV
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_ROOM_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_ROOM_MST;

				File f = new File(orijinalCsvPath);
				if (f.exists()){
					fileExsitFlag = true;
					parser = new CsvParser<Room>();
					List<Room> list = parser.getMappingBeanCsvParser(Room.class,f);
					randGenerator = new RandomGenerator(MyConfig.DB_TABLE_TMP_ROOM_MST);
					List<TMP_ROOM_MST> tmpList = new ArrayList<TMP_ROOM_MST>();
					for(int j = 0; j < list.size(); j++){
						String randomNo = randGenerator.createRandomRandomNo();
						TMP_ROOM_MST tmp = new TMP_ROOM_MST(list.get(j));
						tmp.setRandomNo(randomNo);
						tmpList.add(tmp);
					}

					mst = new ReadingCsvMst<TMP_ROOM_MST>(TMP_ROOM_MST.class);
					insertAndMoveCsv(mst,tmpList,orijinalCsvPath, moveCsvPath);
				}

			}else if(MyConfig.CSV_STUDENT_MST.equals(masterCsvName)){
				//STUDENT_MST.csv
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_STUDENT_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_STUDENT_MST;

				File f = new File(orijinalCsvPath);

				if (f.exists()){
					fileExsitFlag = true;
					parser = new CsvParser<Room>();
					List<Student> list = parser.getMappingBeanCsvParser(Student.class,f);

					randGenerator = new RandomGenerator(MyConfig.DB_TABLE_TMP_STUDENT_MST);
					List<TMP_STUDENT_MST> tmpList = new ArrayList<TMP_STUDENT_MST>();
					for(int j = 0; j < list.size(); j++){
						String randomNo = randGenerator.createRandomRandomNo();
						TMP_STUDENT_MST tmp = new TMP_STUDENT_MST(list.get(j));
						tmp.setRandomNo(randomNo);
						tmpList.add(tmp);
					}
					mst = new ReadingCsvMst<TMP_STUDENT_MST>(TMP_STUDENT_MST.class);
					insertAndMoveCsv(mst,tmpList,orijinalCsvPath, moveCsvPath);
				}
			}else if(MyConfig.CSV_STAFF_MST.equals(masterCsvName)){
				//STAFF_MST.csv
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_STAFF_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_STAFF_MST;

				File f = new File(orijinalCsvPath);

				if (f.exists()){
					fileExsitFlag = true;
					parser = new CsvParser<Staff>();
					List<Staff> list = parser.getMappingBeanCsvParser(Staff.class,f);
					List<TMP_STAFF_MST> tmpList = new ArrayList<TMP_STAFF_MST>();
					randGenerator = new RandomGenerator(MyConfig.DB_TABLE_TMP_STAFF_MST);

					for(int j = 0; j < list.size(); j++){
						String randomNo = randGenerator.createRandomRandomNo();
						TMP_STAFF_MST tmp = new TMP_STAFF_MST(list.get(j));
						tmp.setRandomNo(randomNo);
						tmpList.add(tmp);
					}
					mst = new ReadingCsvMst<TMP_STAFF_MST>(TMP_STAFF_MST.class);
					insertAndMoveCsv(mst,tmpList,orijinalCsvPath, moveCsvPath);
				}
			}else if(MyConfig.CSV_FACULTY_MST.equals(masterCsvName)){
				//FACULTY.csv
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_FACULTY_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_FACULTY_MST;

				File f = new File(orijinalCsvPath);

				if (f.exists()){
					fileExsitFlag = true;
					parser = new CsvParser<Faculty>();
					List<Faculty> list = parser.getMappingBeanCsvParser(Faculty.class,f);
					List<TMP_FACULTY_MST> tmpList = new ArrayList<TMP_FACULTY_MST>();
					randGenerator = new RandomGenerator(MyConfig.DB_TABLE_TMP_FACULTY_MST);

					for(int j = 0; j < list.size(); j++){
						String randomNo = randGenerator.createRandomRandomNo();
						TMP_FACULTY_MST tmp = new TMP_FACULTY_MST(list.get(j));
						tmp.setRandomNo(randomNo);
						tmpList.add(tmp);
					}

					mst = new ReadingCsvMst<TMP_FACULTY_MST>(TMP_FACULTY_MST.class);
					insertAndMoveCsv(mst,tmpList,orijinalCsvPath, moveCsvPath);
				}

			}/*else if(MyConfig.CSV_ACADEMIC_CALENDAR_MST.equals(masterCsvName)){
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_ACADEMIC_CALENDAR_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_ACADEMIC_CALENDAR_MST;

				File f = new File(orijinalCsvPath);
				//ACADEMIC_CALENDAR_MST.csvの場合
				parser = new CsvParser<AcademicCalendar>();
				List<AcademicCalendar> aa = parser.getMappingBeanCsvParser(AcademicCalendar.class,f);




			}*/else if(MyConfig.CSV_TIMETABLE_MST.equals(masterCsvName)){
				//TIMETABLE.csv
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_TIMETABLE_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_TIMETABLE_MST;

				File f = new File(orijinalCsvPath);

				if (f.exists()){
					fileExsitFlag = true;
					parser = new CsvParser<Faculty>();
					List<ClassSchedule> list = parser.getMappingBeanCsvParser(ClassSchedule.class,f);
					List<TMP_CLASS_SCHEDULE_MST> tmpList = new ArrayList<TMP_CLASS_SCHEDULE_MST>();
					randGenerator = new RandomGenerator(MyConfig.DB_TABLE_TMP_CLASS_SCHEDULE_MST);

					for(int j = 0; j < list.size(); j++){
						String randomNo = randGenerator.createRandomRandomNo();
						TMP_CLASS_SCHEDULE_MST tmp = new TMP_CLASS_SCHEDULE_MST(list.get(j));
						tmp.setRandomNo(randomNo);
						tmpList.add(tmp);
					}

					mst = new ReadingCsvMst<TMP_CLASS_SCHEDULE_MST>(TMP_CLASS_SCHEDULE_MST.class);
					insertAndMoveCsv(mst,tmpList,orijinalCsvPath, moveCsvPath);
				}
			}/*else if(MyConfig.CSV_REGISTRATION_MST.equals(masterCsvName)){
				orijinalCsvPath = orijinalCsvPath + MyConfig.CSV_REGISTRATION_MST;
				moveCsvPath = moveCsvPath + System.currentTimeMillis() + "_" +MyConfig.CSV_REGISTRATION_MST;
				File f = new File(orijinalCsvPath);
			}*/

			if(fileExsitFlag == false){
				MyLog.getInstance().info("マスタCSVが存在しませんでした.");
			}

			MyLog.getInstance().info(masterCsvName+"の処理を終了します.");


		}
	}

	private void insertAndMoveCsv(ReadingCsvMst mst,List tmpList,String orijinalCsvPath,String moveCsvPath) throws PersistenceException{
		mst.insertTmpDate(tmpList);
		mst.moveCsvFile(orijinalCsvPath, moveCsvPath);
	}


	/*private void startProcess() throws IOException, PersistenceException, SQLException{
		ReadingCsvMst readingCsvMst = null;
		for(int i=0; i<MASTER_CSV_LIST.length;i++){

			String masterCsvName = MASTER_CSV_LIST[i];
			String tempMasterTableName = TEMP_MASTER_TABLE_LIST[i];

			MyLog.getInstance().info(masterCsvName+"の機能を取得します.");

			if(MyConfig.CSV_ROOM_MST.equals(masterCsvName)){
				//ROOM_MST.csvの場合
				readingCsvMst = getReadingTempRoomMst(masterCsvName);
			}else if(MyConfig.CSV_STUDENT_MST.equals(masterCsvName)){
				//STUDENT_MST.csvの場合
				readingCsvMst = getReadingTempStudentMst(masterCsvName);
			}else if(MyConfig.CSV_STAFF_MST.equals(masterCsvName)){
				//STAFF_MST.csvの場合
				readingCsvMst = getReadingTempStaffMst(masterCsvName);
			}else if(MyConfig.CSV_YEAR_SCHEDULE_MST.equals(masterCsvName)){
				//YEAR_SCHEDULE_MST.csvの場合
				readingCsvMst = getReadingTempYearScheduleMst(masterCsvName);
			}else if(MyConfig.CSV_CLASS_SCHEDULE_MST.equals(masterCsvName)){
				readingCsvMst = getReadingTempClassScheduleMst(masterCsvName);
			}

			if(readingCsvMst != null){
				readingCsvMst.analyze();
				List<TempRandomNoInterface> list = readingCsvMst.getBeans();
				allocateRandomNo(tempMasterTableName,list);
				readingCsvMst.insertTempDate();

				readingCsvMst = null;
			}else{
				MyLog.getInstance().error("「"+masterCsvName+"」処理が未実装です!!");
			}
			MyLog.getInstance().info(masterCsvName+"の処理を終了します.");
		}
	}*/


}
