package Day03;

public class Ex11_while {
	public static void main(String[] args) {
		int count = 0;
		
		while(true) {
			System.out.println(count);
			if (count == 100) break;
			count++;
		}
		
		count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			if(count == 100)isRun = false;
			count++;
		}
	}
}
