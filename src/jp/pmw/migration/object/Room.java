package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class Room {
	//大学名
	@CsvColumn(name="大学名")
	public String universityName;
	//キャンパス名
	@CsvColumn(name="キャンパス名")
	public String campusName;
	//大学名
	@CsvColumn(name="建物名")
	public String buildingName;
	//大学名
	@CsvColumn(name="教室名")
	public String roomName;
	//大学名
	@CsvColumn(name="座席数")
	public String seatCount;
}
