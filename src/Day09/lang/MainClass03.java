package Day09.lang;
/*
 * [[ String Class ]]	
 *  불변의 객체 - 메모리에서 문자열 값이 변경되지 않는다. 
 *  1. 메모리 절약 
 *  2. improve security 
 *  3. safe thread 
 *  
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		String str1 = "abc"; 	// 불변 
		String str2 = "abc";	// 불변
		String str3 = new String("abc");	// new memory 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));	// 값 재사용 
		System.out.println(System.identityHashCode(str3));
		
		str1 = "def";
		System.out.println(System.identityHashCode(str1));
		
		// length 
		String txt = "ABCDEFGHIJK";
		System.out.println("The length fo the txt string is : " + txt.length());
		
		// 문자열이 지정한 문자로 시작하는지 판단 
		String str4 = "apple";
		boolean startWith = str4.startsWith("a");
		System.out.println("startWith : " + startWith);
		
		// 문자열 마지막에 지정한 문자가 있는지를 판단
		String str5 = "test";
		boolean endWith = str5.endsWith("t");
		System.out.println("endsWith : " + endWith);
		
		// 문자 인덱스 번호 반환 
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf : " + indexOf);
		
		// 문자열에 지정한 문자가 마지막으로 몇번째에 있는지 int 반환 
		String str7 = "AndroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf : " + lastIndexOf);
		
		// 문자 치환 
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replaced str8 : " + replace);
		
		// 문자열 나누기(배열로 반환)
		String str9 = "A:B:C:D:abcd";
		String[] split = str9.split(":");
		for(int i = 0; i < split.length; i++) {
			System.out.println("split["+i+"]: " + split[i]);
		}
		
		// 문자열 절삭 
		String str10 = "ABCDEF";
		String substring = str10.substring(0,2);
		System.out.println("substring : " + substring);
		
		// 소문자 반환
		String str11 = "abcDEF";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase : " + toLowerCase);
		
		// 대문자 반환
		String str12 = "abcDEF";
		String toUpperCase = str12.toUpperCase();
		System.out.println("toUpperCase : " + toUpperCase);
		
		// 공백 제거 
		String s = "		java java java 		";		
		String v;
		v = s.trim();
		System.out.println("trim : " + v);
		
		// 문자 비교
		String str13 = "A";
		String str14 = "B";
		int compareTo = str13.compareTo(str14);
		if(compareTo > 0) {
			System.out.println(str13 + " > " + str14);
		}else if (compareTo == 0) {
			System.out.println(str13 + " = " + str14);
		}else {
			System.out.println(str13 + " < " + str14);
		}
		
		// 문자 포함여부 
		String str15 = "abcd";
		String str16 = "c";
		boolean contains = str15.contains(str16);
		System.out.println("contains : " + contains);
		
		// 문자열 추가 변경할 때 주로 사용하는 자료형
		// Thread safe 
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(System.identityHashCode(sb));
		
		sb.append("def");
		System.out.println(System.identityHashCode(sb));
		
		// StringBuilder 동일 그러니 Thread safe가 아니다. 
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abc");
		sBuilder.append("def");
		
		
	}

}
