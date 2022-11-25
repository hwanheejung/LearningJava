package Day04;

public class Ex03_array {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 내열 값 대입하기 
		String[] names = {"A", "B", "C", "D", "E"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 확장 for문 
		for(String tmp : names) {
			System.out.println(tmp);
		}
	}

}
