package Day06.accessmodifier;
import Day06.mypac.MobilePhone;
import Day06.mypac.Phone;

/*
 [[ 접근제어자 ]]
 	public - 모든 클래스에서 접근 가능
 	protected - 같은 패키지 또는 상속 관계에서 접근가능 
 	default - 같은 패키지 접근 가능 
  	private - 같은 클래스 안에서 접근 가능 
  
 */

public class MainClass01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		// protected: 다른 package이기 때문에 에러뜸. 
//		System.out.println(phone.name);
		
		// protected: 같은 package이기 때문에 에러가 뜨지 않음. 
		MobilePhone mp = new MobilePhone();
		System.out.println(mp.getName());
		
//		mp.name = "Galaxy";
		mp.setName("Galaxy");
		System.out.println(mp.getName());
		
		
		
	}

}
