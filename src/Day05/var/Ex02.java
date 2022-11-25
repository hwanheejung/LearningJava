package Day05.var;

import Day05.mypac.MathUtil;

public class Ex02 {
	// 기본형 / 전역변수 / static 변수
	public static int num = 10;
	// 기본형 / 전역변수 / 동적 
	public int num2 = 20;
	
	public static void main(String[] args) {
		// 기본형 / 지역변수 / 동적. 반드시 초기화! 
		int num3 = 30;
		
		
		System.out.println(num);
		
		Ex02 a = new Ex02();
		System.out.println(a.num2);
		
		// static: 객체명.정적변수명 생성없이 사용가능 
		
		
		
		
	}
}
