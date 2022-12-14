package Day08.mypac;

public class MyUtil {
	
	public String name = "MyUtil";
	public static String staticName = "마이유틸";
	
	// 내부클래스
	public class HelloPrinter{
		//메소드
		public void printHello() {
			System.out.println(name + "의 내부클래스 HelloPrinter 입니다.");			
			System.out.println("Hello~");
		}
	}
	
	// static 내부클래스
	public static class Calculator{
		//메소드
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println(staticName+"의 내부클래스 Calculator");
			System.out.println("전달받은 두 정수의 합: "+ result);
		}
	}

}


