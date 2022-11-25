package Day04;
/*
 break : 반복문 종료
 continue : skip 
 */

public class Ex01_break {
	public static void main(String[] args) {
		
		// break문 
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println("i : " + i);
		}
		
		// while문 
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("i : " + i);
		}
		
		
		
	}

}
