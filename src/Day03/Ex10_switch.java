package Day03;

public class Ex10_switch {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("0~3이 아닙니다.");
			break;
			
		}
		
		// 게임개발에서 많이 사용 
		char ch = 'w';
		
		switch (ch) {
		case 'w':
			System.out.println("앞으로 이동");
			break;
		case 'a':
			System.out.println("좌측으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		case 'd':
			System.out.println("우측으로 이동");
			break;
		default:
			System.out.println("공격!!");
			break;
		}
	}
}
