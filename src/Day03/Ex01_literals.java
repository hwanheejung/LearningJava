package Day03;

/*
 [[ 리터럴 ]]
  	고정된 값
  
  	숫자 예) 10, 10.1
 	문자 예) 'H', '글'
 
 [[ 특수문자 리터럴 ]]
	\t : Tab
	\n : Newline
	\\ : Backslash
	\' : Single quote
	\" : Double quote
	\0 : Null character

 */

public class Ex01_literals {
	public static void main(String[] args) {
		String str1 = "\"JavaStudy\"";
		System.out.println(str1);
		
		String str2 = "Hello. \nThis is \'Hwanhee\' speaking.\n \tNice to meet you";
		System.out.println(str2);
	}

}
