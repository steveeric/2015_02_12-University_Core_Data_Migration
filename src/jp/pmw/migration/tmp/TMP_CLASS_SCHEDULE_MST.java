package jp.pmw.migration.tmp;

import jp.pmw.migration.object.ClassSchedule;

public class TMP_CLASS_SCHEDULE_MST extends BaseTmp{

	private ClassSchedule cs;
	public TMP_CLASS_SCHEDULE_MST(ClassSchedule cs){
		this.cs = cs;
	}
	public String getUNIVERSITY_NAME(){
		return this.cs.universityName;
	}
	public String getDEPT_NAME(){
		return this.cs.deptName;
	}
	public String getMAJOR_NAME(){
		return init(this.cs.majorName);
	}
	public String getGRADE(){
		return this.cs.grade;
	}
	public String getYEAR(){
		return this.cs.year;
	}
	public String getSEMESTER(){
		return this.cs.semester;
	}
	public String getDAY_NAME(){
		return this.cs.dayName;
	}
	public String getTIME_SECTION(){
		return this.cs.timeSection;
	}
	public String getTIMETABLE_NAME(){
		return this.cs.timetableName;
	}
	public String getCLASS_START_TIME(){
		return this.cs.classStartTime;
	}
	public String getCLASS_END_TIME(){
		return this.cs.classEndTime;
	}
	public String getSUBJECT_NUMBER(){
		return this.cs.subjectNumber;
	}
	public String getSUBJECT_NAME(){
		return this.cs.subjectName;
	}
	public String getSUBJECT_REMARKS(){
		return init(this.cs.subjectRemarks);
	}
	public String getFACULTY_ID_NUMBER(){
		return init(this.cs.facultyIdNumber);
	}
	public String getNot_OVERLAP_NAME(){
		return init(this.cs.notOverlapName);
	}
	public String getCAMPUS_NAME(){
		return init(this.cs.campusName);
	}
	public String getROOM_NAME(){
		return this.cs.roomName;
	}
}
