package Day03;

/*
 [[ Operator ]]
 1. Arithmetic Operators
 	+, -, *, \, %
 	
 		c.f) int + str = str

 */
public class Ex02_ArithmeticOp {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// 두 수의 합을 구해서 sum이라는 int형 변수에 대입 
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		// 두 수의 곱을 구해서 mul이라는 int형 변수에 대입 
		int mul = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + mul);
		
		// 실수 계산 부동소수점 오차 생길 수 있음. 
		double div = num1 / 3.0;
		System.out.println(num1 + " / " + 3.0 + " = " + div); //3.3333333333333335
		
		// 나머지 
		int remainder = num1 % 3;
		System.out.println(num1 + " % " + 3.0 + " = " + remainder);
		
	}

}
