package jp.pmw.migration.university_core_data;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.jenkov.db.itf.PersistenceException;

public interface ReadingCsvInterface<T> {
	/**
	* createdate : 2015年1月27日
	* insertTempDateメソッド
	* CSVから取得したデータをDBにインサートする.
	* @throws com.jenkov.db.itf.PersistenceException マッピングが上手く行かなかった.
	＊*/
	public void insertTmpDate(List<T> tmpList) throws PersistenceException;

	/**
	* createdate : 2015年2月4日
	* moveCsvFileメソッド
	* csvファイルを移動する
	*/
	public void moveCsvFile(String orijinalCsvPath,String moveCsvPath);

}
