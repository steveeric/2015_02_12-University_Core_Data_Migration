package jp.pmw.migration.tmp;

import jp.pmw.migration.object.Faculty;

public class TMP_FACULTY_MST extends BaseTmp{

	private Faculty s;
	public TMP_FACULTY_MST(Faculty s){
		this.s = s;
	}

	public String getUNIVERSITY_NAME(){
		return this.s.universityName;
	}

	public String getFaculty_Id_Number(){
		return this.s.facultyIdNumber;
	}
	public String getREGISTRATION_ACTIVE_STATUS(){
		return this.s.workStatus;
	}
	public String getFurigana_Family_Name(){
		return this.s.furiganaFamilyName;
	}
	public String getFurigana_Given_Name(){
		return this.s.furiganaGivenName;
	}
	public String getFamily_Name(){
		return this.s.familyName;
	}
	public String getGiven_Name(){
		return this.s.givenName;
	}
	public String getNot_Overlap_Name(){
		return this.s.notOverlapName;
	}
	public String getEmployment(){
		return this.s.employment;
	}
	public String getPosition(){
		return this.s.position;
	}
	public String getDEPT_NAME(){
		return this.s.deptName;
	}
}
