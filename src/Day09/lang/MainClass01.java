package Day09.lang;
/*
 * [[ java.lang package ]]
 * 	- 기본 제공해주는 패키지
 *  - import 필요없음
 *  
 * [[ Object class ]] 
 *  - 모든 클래스의 최상위 부모.
 *  - 즉 모든 클래스는 Object 클래스를 상속받는다. 
 *  - extends 생략 
 *  
 * 		equals() method: 두 객체가 동일한 객체면 true / 다르면 false
 * 		hashCode() method: 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴 
 * 		toString() method: 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 * 		clone(): 새로운 객체로 복사(깊은복사)
 *  
 *  
 */
public class MainClass01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		if(car1.equals(car2)) {		// 주소값 같은지 확인 
			System.out.println("car1 = car2");
		}else {
			System.out.println("car1 != car2");
		}
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		String str = "hello";
		System.out.println(str.toString());
		System.out.println(str);
		
		// clone method로 객체 깊은복사 
		Car car3 = (Car) car1.clone();
		// 주소값 얕은복사 
		Car car4 = car1;
		System.out.println(car1);
		System.out.println(car3);
		System.out.println(car4);
		
	}

}

class Car implements Cloneable {
	String model;
	String color;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}