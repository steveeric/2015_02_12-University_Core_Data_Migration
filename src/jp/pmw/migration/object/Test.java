package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class Test {
	//大学名
	@CsvColumn(name="大学名")
	public String university_name;
	//学部名
	@CsvColumn(name = "学部名")
	public String school_name;

	public void setUniversity_name(String university_name){
		this.university_name = university_name;
	}
	public String getUniversity_name(){
		return this.university_name;
	}

	public void setSchool_name(String school_name){
		this.school_name = school_name;
	}
	public String getSchool_name(){
		return this.school_name;
	}

}
