package Day09.thread;

import Day09.myThread.Brother;
import Day09.myThread.Sister;
import Day09.myThread.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		// Wallet 객체 생성 
		Wallet wallet = new Wallet();
		
		// Sister Thread 객체 생성
		Sister sister = new Sister(wallet);
		
		// Brother Thread 객체 생성
		Brother brother = new Brother(wallet);
		
		//각각의 객체를 이용해서 두개의 스레드 시작시키기
		sister.start();
		brother.start();
		
		System.out.println("MainThread over");
		
	}

}

// 이처럼 문제가 생길 수 있으므로 병렬프로그램 되도록 사용X 
// brother가 작동할 때는 sister는 접근하지 못하게 해야함. -> wallet에서 getMoney에 synchronized method 추가 