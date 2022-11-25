package Day04;
/*
 [[ Method ]]
 	어떤 특정 작업을 수행하기 위한 명령문의 집합 
 
 접근제어자 (정적) 반환타입 메소드이름(매개변수타입 매개변수명){		//선언부
 	명령문 		// 구현부 
 	
 	return 반환값; 
 }
 
 오버로딩	
 	: 메소드 명이 같아도, 매개변수 갯수 또는 타입이 다르면 사용가능 
 
 */
public class Ex05_method {
	public static String name;		// 전역변수 
	
	
	public static void main(String[] args) {
		// method 호출하기 
		hello();
		
		printName("Zoey");
		printName("Harry", 10);
		
		setName("Son");
		String strName = getName();
		System.out.println("전역변수 name: " + strName);
	}
	
	// 매개변수x 반환값x => 실행하고 끝나는 메소드  
	public static void hello() {
		System.out.println("Hello World~!");
	}
	
	// 매개변수o 반환값x 
	public static void printName(String name) {
		System.out.println("이름: " + name);
		
	}
	
	// 오버로딩메소드 
	public static void printName(String name, int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
	
	// 매개변수o 반환값x => 매개변수를 전역변수 name에 대입 
	public static void setName(String name) {
		Ex05_method.name = name;
	}
	
	// 매개변x 반환값o => 전역변수 name을 반환  
	public static String getName() {
		return name;			// Ex05_method.name
	}
	
	
}
