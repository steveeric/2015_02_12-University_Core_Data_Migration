package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class ClassSchedule {
	//大学名
	@CsvColumn(name="大学名")
	public String universityName;
	//学部名
	@CsvColumn(name = "対象学部名")
	public String schoolName;
	//学科名
	@CsvColumn(name = "対象学科名")
	public String deptName;
	//専攻名(なければNULLで構いません)
	@CsvColumn(name = "対象専攻名")
	public String majorName;
	//対象入学時期
	@CsvColumn(name = "対象入学時期")
	public String enrollmentPeriod;
	//対象入学時期判定
	@CsvColumn(name = "対象入学時期判定")
	public String enrollmentPeriodJudge;
	//学年
	@CsvColumn(name = "学年")
	public String grade;
	//提供年度年
	@CsvColumn(name = "提供年度")
	public String year;
	//学期名
	@CsvColumn(name = "学期名")
	public String semester;
	//曜日
	@CsvColumn(name = "曜日名")
	public String dayName;
	//時間帯区分
	@CsvColumn(name = "時間帯区分")
	public String timeSection;
	//時限名
	@CsvColumn(name = "時限名")
	public String timetableName;
	//授業開始時間
	@CsvColumn(name = "授業開始時刻")
	public String classStartTime;
	//授業終了時間
	@CsvColumn(name = "授業終了時刻")
	public String classEndTime;
	//科目番号
	@CsvColumn(name = "科目番号")
	public String subjectNumber;
	//科目名
	@CsvColumn(name = "科目名")
	public String subjectName;
	//科目備考
	@CsvColumn(name = "科目備考")
	public String subjectRemarks;
	//教員番号
	@CsvColumn(name = "教員番号")
	public String facultyIdNumber;
	//全教員で重複しない名(教員番号を入力した場合はいりません)
	@CsvColumn(name = "全教員で重複しない名前")
	public String notOverlapName;
	//キャンパス名(キャンパス名がなければ)
	@CsvColumn(name = "キャンパス名")
	public String campusName;
	//教室名
	@CsvColumn(name = "教室名")
	public String roomName;

	/*
	public void setYear(String year){
		this.year = year;
	}
	public void setSemester(String semester){
		this.semester = semester;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public void setWeekdayName(String weekdayName){
		this.weekdayName = weekdayName;
	}
	public void setTimeSection(String timeSection){
		this.timeSection = timeSection;
	}
	public void setTimetableName(String timetableName){
		this.timetableName = timetableName;
	}
	public void setClassStartTime(String classStartTime){
		this.classStartTime = classStartTime;
	}
	public void setClassEndTime(String classEndTime){
		this.classEndTime = classEndTime;
	}
	public void setSubjectNumber(String subjectNumber){
		this.subjectNumber = subjectNumber;
	}
	public void setSubjectName(String subjectName){
		this.subjectName = subjectName;
	}
	public void setSubjectRemarks(String subjectRemarks){
		this.subjectRemarks = subjectRemarks;
	}
	public void setFacultyIdNumber(String facultyIdNumber){
		this.facultyIdNumber = facultyIdNumber;
	}
	public void setNotOverlapName(String notOverlapName){
		this.notOverlapName = notOverlapName;
	}
	public void setCampusName(String campusName){
		this.campusName = campusName;
	}
	public void setRoomName(String roomName){
		this.roomName = roomName;
	}



	public String getYear(){
		return this.year;
	}
	public String getSemester(){
		return this.semester;
	}
	public String getGrade(){
		return this.grade;
	}
	public String getWeekdayName(){
		return this.weekdayName;
	}
	public String getTimeSection(){
		return this.timeSection;
	}
	public String getTimetableName(){
		return this.timetableName;
	}
	public String getClassStartTime(){
		return this.classStartTime;
	}
	public String getClassEndTime(){
		return this.classEndTime;
	}
	public String getSubjectNumber(){
		return this.subjectNumber;
	}
	public String getSubjectName(){
		return this.subjectName;
	}
	public String getSubjectRemarks(){
		return this.subjectRemarks;
	}
	public String getFacultyIdNumber(){
		return this.facultyIdNumber;
	}
	public String getNotOverlapName(){
		return this.notOverlapName;
	}
	public String getCampusName(){
		return this.campusName;
	}
	public String getRoomName(){
		return this.roomName;
	}
	*/


}
