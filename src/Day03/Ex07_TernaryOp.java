package Day03;
/*
  [[ Operator ]]
 6. Ternary Operator (삼항연산자)
 	조건식 ? 조건식이 참인 경우 : 조건식이 거짓인 경우
 	
 */
public class Ex07_TernaryOp {
	public static void main(String[] args) {
		int num = -10;
		String result = num > 0 ? "num은 양수" : "num은 음수";
		System.out.println(result);
		
		
		// if문으로 똑같이 구현
		String result2 = null;
		if(num > 0){
			result2 = "num은 양수";
			}
		else {
			result2 = "num은 음수";
		}
		System.out.println(result2);
				
	}

}
