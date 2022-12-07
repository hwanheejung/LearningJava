package Day09;

import Day09.mypac.Phone;

/*
 * [[ 생성자 (Constructor ]]
 *	 	- 객체를 생성할 때 호출하는 반환값이 없는 메소드. 사실 메소드는 아니다! 
 * 		- 객체 초기화 목적에 사용 
 * 		- 클래스명과 동일
 * 		- 오버로딩 가능 
 */


public class Mainclass01 {
	public static void main(String[] args) {
		// 객체 생성될 때 생성자 실행 
		Phone hp = new Phone();
		
		Phone hp2 = new Phone("iPhone");
		
		System.out.println("hp model: " + hp.model);
		System.out.println("hp2 model: " + hp2.model);
	}
	
}
