package Day05.oop;

/*
 [[ 객체란 ]]
 	물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
 	정의가능 식별 가능한것!
 	
 	ex) 실제 존재하는 것 - 자동차, 휴대폰, 컴퓨터, 학생, 회원
 		추상적인 것 - 주문, 배송, 생산 등
 		모두 객체가 될 수 있다. 
 		
 	최소한의 프로그램 단위
 	
 	객체를 만들기 위해서 주형 또는 설계도 => class
 	
 	class에 작성된 코드를 읽어 객체화한다 => 메모리에 올린다 
 	
 클래스 구조
 class 클래스명{
	생성자
	변수
	메소드
	
 }
 
 객체화
	클래스명 변수명 = new 클래스명();
 
 객체 구성요소 
 	생성자 => 초기화 
 	변수 => 속성값
 	메소드 => 기능 
 	
 */
public class Ex01_oop {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1 Model: "+ car1.model);
		System.out.println("car1 Color: "+ car1.color);
		
		car1.drive();
		car1.selfDrive();
		
		Car car2 = new Car();
		car2.model = "Tesla Y";
		car2.color = "yellow";
		System.out.println("car2 Model: "+ car2.model);
		System.out.println("car2 Color: "+ car2.color);
		
		car2.drive();
		car2.selfDrive();
	
		
	}
	
}

// Car
class Car{
	String model = "Ferrari";
	String color = "Red";
	
	public void drive() {
		System.out.println(model + ": Drive");
	}
	
	public void selfDrive() {
		System.out.println(model + ": Self-Drive Mode");
	}
}




