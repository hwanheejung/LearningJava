package Day04;
/*
 * [[ Array ]]
 * 하나의 변수에 여러값을 저장 
 * 
 */
public class Ex02_array {
	public static void main(String[] args) {
		
		// 배열 선언 
			// 정수를 10개 담을 수 있는 배열 객체 생성 
		int[] nums = new int[10];
		
			// 실수를 10개 담을 수 있는 배열 객체 생성 
		double[] nums2 = new double[10];
		
			// 문자열(string)을 10개 담을 수 있는 배열 객체 생성 
		String[] nums3 = new String[10];
		
		
		// 배열객체 생성하기
		String[] names = new String[6];
		names[0] = "Amy";
		names[1] = "Bob";
		names[2] = "Carry";
		names[3] = "Danny";
		names[4] = "Eric";
		names[5] = "Gabby";
		
		// 값 가져오기 
		System.out.println(names[3]);    // Danny 
		// 배열의 길이 
		System.out.println(names.length); // 6
		// 전체 출력 
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 배열 값 변경 
		names[4] = "Harry";
		
		System.out.println("\n확장 for문");
			// 확장 for문을 이용해서 출력하기 
		for(String tmp : names) {
			System.out.println(tmp);
		}
		
	}

}
