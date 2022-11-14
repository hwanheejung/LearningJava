package Day02;
/*
 *[[ 기본 자료형 ]]
 *
 * 4. 실수형
 *  - 선언하는 방법
 *  	float 변수명;
 *  	double 변수명;
 *  
 *  	float(4byte) < double(8byte)
 * 
 * 실수계산 부동소수점오차 예외처리하기!
 * 
 * c.f) 메모리 공간이 넓을수록 컴퓨터가 소수점 실수에 대한 연산에 대한 오차가 생김. 
 */

public class Ex05_primitiveType4 {
	public static void main(String[] args) {
		// 실수형 변수 선언과 동시에 값 대입하기
		float iFloat = 10.1f;		// float에 f 생략하면 double로 인식함
		double iDouble = 10.1d;
		double iDouble2 = 10.1;		// doulbe형 d는 생략 가능
		
		System.out.println("float형: " + iFloat);
		System.out.println("double형: " + iDouble);
		System.out.println("double2형: " + iDouble2);
		
	}
}
