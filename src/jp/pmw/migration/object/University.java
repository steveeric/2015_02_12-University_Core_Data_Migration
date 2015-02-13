package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;
@CsvEntity
public class University {
	//大学名
	@CsvColumn(name="大学名")
	public String universityName;

	/*
	//大学名セッター
	public void setUniversityName(String universityName){
		this.universityName = universityName;
	}
	//大学名ゲッター
	public String getUniversityName(){
		return this.universityName;
	}
	*/
}
