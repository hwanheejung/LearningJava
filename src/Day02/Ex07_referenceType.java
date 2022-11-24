package Day02;
/*
 * [[ 참조형 데이터형(Reference Type) ]]
 * 
 * 5. String형 (문자열)
 *  - 선언하는 방법
 *  	String  변수명;
 *  - 문자열을 저장할 수 있다.
 * 
 * c.f) primitive type(기본형) : boolean, char, byte, short, int, long, float, double
 	reference type(참조형) : 기본형을 제외한 모든 
 * 
 */
public class Ex07_referenceType {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요";
		System.out.println("str : " + str);
		
		String addr = "서울특별시 서대문구 신촌";
		boolean isContain = addr.contains("신촌");
		if (isContain) {
			System.out.println("addr contains '신촌'");
	}

}
