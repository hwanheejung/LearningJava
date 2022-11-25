package Day03;
/*
  for(초기화변수; 조건식; 증감식) {
	반복 수행할 코드 
   }
 
 */
public class Ex13_for {
	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 1. 별그리기 
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");		// print는 개행 안함. println은 print하고 개행.
				
			}
			System.out.println();  		// 개행 
			
		}
		
		// 2. 별그리기 
		for(int i = 0; i < 7; i++) {
			for(int k = 6; k > i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");		
				
			}
			System.out.println();  		
			
		}
		
		// 3. 별그리기 
		for(int i = 0; i < 7; i+=2) {
			for(int k = 6; k > i; k-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");		
				
			}
			System.out.println();  		
			
		}
		
		// 4. 별그리기 
	
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i < 4) {
					if(j + i < 3) {
						System.out.print(" ");
					}else if(j-i > 3){
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}else {
					if(i - j > 3) {
						System.out.print(" ");
					}else if(i+j > 9){
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
					
					
					
				}
				
			}
			System.out.println();  		
			
		}
		
		
	}

}
