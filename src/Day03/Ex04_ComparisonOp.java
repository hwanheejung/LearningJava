package Day03;
/*
 [[ Operators ]]
 3. Comparison Operator(비교연산자)
 	>, >= , < , <=, ==, !=
 	boolean type으로 돌려줌 
 */

public class Ex04_ComparisonOp {
	public static void main(String[] args) {
		boolean result = 10 < 20;
		if(result) {
			System.out.println("10 < 20");
		}
		
		if(10 == 10) {
			System.out.println("10 = 20");
		}
		
		if(10 != 20) {
			System.out.println("10 != 20");
		}
	}

}
