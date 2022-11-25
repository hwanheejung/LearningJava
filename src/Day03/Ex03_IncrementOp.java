package Day03;
/*
 [[ Operator ]]
 2. Increment operator(증감연산자)
 	++ : 1씩 증가
 	-- : 1씩 감소
 */
public class Ex03_IncrementOp {
	public static void main(String[] args) {
		int num = 0;
		System.out.println("num: " + num);
		num++;
		System.out.println("num++: " + num);
		
		int num2 = 0;
		System.out.println("num: " + num2);
		num2--;
		System.out.println("num--: " + num2);
		
		// 0~99까지 출력하는 반복문 
		for (int i=0; i < 100; i++) {
			System.out.println(i);
		}
		
		// ++num vs num++
		int num3 = 0;
		System.out.println("num3: " + num3++);	// 다음줄에서 ++
		
		int num4 = 0;
		System.out.println("num4: " + ++num4);  // 먼저 ++
	}

}
