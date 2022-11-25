package Day03;
/*
 2. do ~ while 문 
 
 do{
 	반복수행할 코드 
 }while(조건문);
 
 조건문이 false여도 한번은 실행됨. 거의 안씀 
 */

public class Ex12_do_while {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		}while(count < 100);
	}

}
