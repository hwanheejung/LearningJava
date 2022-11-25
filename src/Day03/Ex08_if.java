package Day03;
/*
 [[ 조건문 ]]
	- 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
	- if문 사용법
		
		if(조건식){
			조건식 true일 때 실행명령문
		} else if(조건식){
			조건식 true일 때 실행명령문 
		} else{
			모든 조건식이 false일 때 실행명령문
		}
 */
public class Ex08_if {
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("num은 짝수입니다.");
		}else {
			System.out.println("num은 홀수입니다.");
		}
	}

}
