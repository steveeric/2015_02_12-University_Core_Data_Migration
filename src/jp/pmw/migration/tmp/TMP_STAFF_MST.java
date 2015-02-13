package jp.pmw.migration.tmp;

import jp.pmw.migration.object.Staff;

public class TMP_STAFF_MST extends BaseTmp{
	private Staff s;
	public TMP_STAFF_MST(Staff s){
		this.s = s;
	}

	public String getUNIVERSITY_NAME(){
		return this.s.universityName;
	}
	public String getSTAFF_ID_NUMBER(){
		return init(this.s.staffIdNumber);
	}
	public String getREGISTRATION_ACTIVE_STATUS(){
		return this.s.registrationActiveStatus;
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
	public String getEmployment(){
		return init(this.s.employment);
	}
	public String getDivisionName(){
		return init(this.s.divisionName);
	}
	public String getDepartment_Name(){
		return this.s.departmentName;
	}

}
