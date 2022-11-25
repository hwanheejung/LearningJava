package Day06.Abstract;

import Day06.Abstract.pac.Man;
import Day06.Abstract.pac.Woman;

/*
 * 
 * [[ 추상클래스(Abstract Class) ]]
 * 		: 구현되지 않은 추상 메소드가 존재한다. 
 * 		: 정의만 하고 구현 X 
 * 		: 미완성 클래스 
 * 		: 미완성 메소드를 가지고 있다. 
 * 		: 상속을 받고 반드시 오버라이딩 해야한다. 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// TODO: abstract method override 
		// Human h1 = new Human();
		
		Woman w1 = new Woman();
		
		w1.talk();
		w1.think();
		
		Man m1 = new Man();
		
		m1.talk();
		m1.think();
		
	}
}
