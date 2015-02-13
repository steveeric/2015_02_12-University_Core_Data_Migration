package jp.pmw.migration.object;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@CsvEntity
public class Dept extends University{

	//学部名
	@CsvColumn(name = "学部名")
	public String schoolName;
	//学科名
	@CsvColumn(name = "学科名")
	public String deptName;

}
