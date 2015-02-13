package jp.pmw.migration.tmp;

import jp.pmw.migration.object.Student;

public class TMP_STUDENT_MST extends BaseTmp{
	private Student s;
	public TMP_STUDENT_MST(Student s){
		this.s = s;
	}

	public String getstudentIdNumber(){
		return this.s.studentIdNumber;
	}
	public String getRegistration_Active_Status(){
		return this.s.registrationActiveStatus;
	}
	public String getFurigana_Family_Name(){
		return this.s.furiganaFamilyName;
	}
	public String getFURIGANA_GIVEN_NAME(){
		return this.s.furiganaGivenName;
	}
	public String getFamily_Name(){
		return this.s.familyName;
	}
	public String getGiven_Name(){
		return this.s.givenName;
	}
	public String getUNIVERSITY_NAME(){
		return this.s.universityName;
	}

	public String getAlias(){
		return this.s.alias;
	}
	public String getGrade(){
		return this.s.grade;
	}
	public String getSCHOOL_NAME(){
		return this.s.schoolName;
	}
	public String getDEPARTMENT_NAME(){
		return this.s.deptName;
	}
	public String getMAJOR_NAME(){
		return init(this.s.majorName);
	}
	public String getStudent_Remarks(){
		return init(this.s.studentRemarks);
	}
}
