package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class Student extends Person{
	@CsvColumn(name="大学名")
	public String universityName;
	//学生名称
	@CsvColumn(name="学生名称")
	public String alias;
	//学部名
	@CsvColumn(name = "学部名")
	public String schoolName;
	//学科名
	@CsvColumn(name = "学科名")
	public String deptName;
	//専攻名
	@CsvColumn(name = "専攻名")
	public String majorName;
	//対象入学時期
	@CsvColumn(name = "入学日")
	public String enrollmentPeriod;
	//学年
	@CsvColumn(name = "学年")
	public String grade;
	//学生備考
	@CsvColumn(name = "学生備考")
	public String studentRemarks;
	//学籍番号
	@CsvColumn(name = "学籍番号")
	public String studentIdNumber;
	//アクティブ状態ステータス
	@CsvColumn(name = "在籍状況")
	public String registrationActiveStatus;
	//ふりがな苗字
	@CsvColumn(name = "ふりがな苗字")
	public String furiganaFamilyName;
	//ふりがな名前
	@CsvColumn(name = "ふりがな名前")
	public String furiganaGivenName;
	//苗字
	@CsvColumn(name = "苗字")
	public String familyName;
	//名前
	@CsvColumn(name = "名前")
	public String givenName;



	/*
	public void setStudentIdNumber(String studentIdNumber){
		this.studentIdNumber = studentIdNumber;
	}

	public void setAlias(String alias){
		this.alias = alias;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public void setStudentRemarks(String studentRemarks){
		this.studentRemarks = studentRemarks;
	}
	public String getstudentIdNumber(){
		return this.studentIdNumber;
	}
	public String getAlias(){
		return this.alias;
	}
	public String getGrade(){
		return this.grade;
	}
	public String getStudentRemarks(){
		return this.studentRemarks;
	}
	 */
}