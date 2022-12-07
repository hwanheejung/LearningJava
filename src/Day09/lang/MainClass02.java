package Day09.lang;
/*
 * [[ 래퍼 클래스(Wrapper Class) ]]
 *	- 8개의 기본 타입에 해당하는 데이터를 객체로 표현. 	
 *  - boolean, byte, short, int, long float double, char
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 기본형 변수 
		boolean b = true;
		Boolean wp1 = new Boolean(true);	// 이렇게 써도 되긴 하지만 추천 안한다는 뜻. 
		Boolean wp2 = new Boolean(false);
		
		Boolean wp3 = Boolean.valueOf(true);	// 이렇게 쓰기도 함. 
		
		Integer number1 = new Integer(10);
		Integer number2 = new Integer(10);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		
		System.out.println("number1 == number3 : " + (number1 == number3));
		System.out.println("number1 == number2 : " + (number1 == number2));
		
		int number4 = number1;
		int number5 = number2;
		System.out.println("number4 == number5 : " + (number4 == number5));
		
		int iNum1 = Integer.parseInt("100");
		int iNum2 = Integer.parseInt("100");
		
		System.out.println(iNum1 + iNum2);
	}

}
