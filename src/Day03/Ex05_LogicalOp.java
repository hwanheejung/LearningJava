package Day03;
/*
 [[ Operators ]]
 4. Logical Operator(논리연산자)
 	&& : And
 	|| : Or
 	! : Not
 */
public class Ex05_LogicalOp {
	public static void main(String[] args) {
		boolean result = true && true;
		System.out.println(result);
		
		result = true || false;
		System.out.println(result);
		
		result = !false;
		System.out.println(result);
		
		result = (10 > 20) || !true;
		System.out.println(result);
		
		
	}

}
