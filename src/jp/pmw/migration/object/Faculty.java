package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class Faculty {//extends Dept{
	//大学名
	@CsvColumn(name="大学名")
	public String universityName;
	//学部名
	@CsvColumn(name = "所属学部名")
	public String schoolName;
	//学科名
	@CsvColumn(name = "所属学科名")
	public String deptName;

	@CsvColumn(name="雇用名称")
	public String employment;
	//教員名称
	@CsvColumn(name="教員名称")
	public String position;
	//教員ID番号
	@CsvColumn(name="教員番号")
	public String facultyIdNumber;
	//アクティブ状態ステータス
	@CsvColumn(name="勤務状況")
	public String workStatus;
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
	//重複名がない名前
	@CsvColumn(name="全教員で重複しない名前")
	public String notOverlapName;
	/*
	public void setFacultyIdNumber(String facultyIdNumber){
		this.facultyIdNumber = facultyIdNumber;
	}
	public void setNotOverlapName(String notOverlapName){
		this.notOverlapName = notOverlapName;
	}
	public void setEmployment(String employment){
		this.employment = employment;
	}
	public void setPosition(String position){
		this.position = position;
	}

	public String getFacultyIdNumber(){
		return this.facultyIdNumber;
	}
	public String getNotOverlapName(){
		return this.notOverlapName;
	}
	public String getEmployment(){
		return this.employment;
	}
	public String getPosition(){
		return this.position;
	}
	 */

}
