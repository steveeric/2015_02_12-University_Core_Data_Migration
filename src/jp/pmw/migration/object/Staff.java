package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class Staff{
	//大学名
	@CsvColumn(name="大学名")
	public String universityName;
	//雇用名称
	@CsvColumn(name="雇用名称")
	public String employment;
	//所属部署名
	@CsvColumn(name="所属部署名")
	public String divisionName;
	//所属課名称
	@CsvColumn(name="所属課名")
	public String departmentName;
	//職員ID番号
	@CsvColumn(name="職員番号")
	public String staffIdNumber;
	//アクティブ状態ステータス
	@CsvColumn(name="勤務状況")
	public String registrationActiveStatus;
	//ふりがな苗字
	@CsvColumn(name="ふりがな苗字")
	public String furiganaFamilyName;
	//ふりがな名前
	@CsvColumn(name="ふりがな名前")
	public String furiganaGivenName;
	//苗字
	@CsvColumn(name="苗字")
	public String familyName;
	//名前
	@CsvColumn(name="名前")
	public String givenName;

	/*
	public void setEmployment(String employment){
		this.employment = employment;
	}
	public void setDivisionName(String divisionName){
		this.divisionName = divisionName;
	}
	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;
	}
	public void setStaffIdNumber(String staffIdNumber){
		this.staffIdNumber = staffIdNumber;
	}
	public void setRegistrationActiveStatus(String registrationActiveStatus){
		this.registrationActiveStatus = registrationActiveStatus;
	}
	public void setFuriganaFamilyName(String furiganaFamilyName){
		this.furiganaFamilyName = furiganaFamilyName;
	}
	public void setFuriganaGiveName(String furiganaGivenName){
		this.furiganaGivenName = furiganaGivenName;
	}
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}


	public String getEmployment(){
		return this.employment;
	}
	public String getDivisionName(){
		return this.divisionName;
	}
	public String getDepartmentName(){
		return this.departmentName;
	}
	public String getStaffIdNumber(){
		return this.staffIdNumber;
	}
	public String getRegistrationActiveStatus(){
		return this.registrationActiveStatus;
	}
	public String getFuriganaFamilyName(){
		return this.furiganaFamilyName;
	}
	public String getFuriganaGiveName(){
		return this.furiganaGivenName;
	}
	public String getFamilyName(){
		return this.familyName;
	}
	public String getGivenName(){
		return this.givenName;
	}
	*/
}
