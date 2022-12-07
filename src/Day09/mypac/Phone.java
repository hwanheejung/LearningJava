package Day09.mypac;

public class Phone {
	public String model;	// 전역변수 초기화하지 않으면 null 
	
	static{
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
	}
	
	// 생성자 - 클래스명과 동일 
	public Phone() {
		this.model = "Galaxy";
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	
	public Phone(String model) {
		this.model = model;
		System.out.println("생성자로 " + model + "이 전달되었습니다");
	}
}
