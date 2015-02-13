package jp.pmw.migration.object;

public class Person extends Dept{
	//アクティブ状態ステータス
	private String registrationActiveStatus;
	//ふりがな苗字
	private String furiganaFamilyName;
	//ふりがな名前
	private String furiganaGivenName;
	//苗字
	private String familyName;
	//名前
	private String givenName;

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
}
