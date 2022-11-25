package Day06.constant;
/*
 * [[ 상수 ]]
 * 		: 처음 할당된 값이 변경되지 않는다. 
 * 		: final 함수 사용 
 * 		: 상수는 대문자로 선언. (통상적으로)
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		final double PI = 3.141592;		// cannot change this value 
		int r = 10;
		double area = PI * r * r;
		
		System.out.println("원의 넓이: " + area);
		
		System.out.println("pi ratio: " + Math.PI);
		
		area = 0;
		area = Math.PI * Math.pow(r, 2);
		System.out.println(area);
		
	}

}
