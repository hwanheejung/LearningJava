package Day06.mypac;
/*
 [[ VO(Value Object), 
 	DTO(Data Transfer Object) ]]
 	
 값 오브젝트로써 목적에 맞는 변수의 집합 
 			 DataBase 값 운반용으로 사용  
 			 
 
 */
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String phoneNumber;
	private String addy; 
	private String birth;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddy() {
		return addy;
	}
	public void setAddy(String addy) {
		this.addy = addy;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	

}
