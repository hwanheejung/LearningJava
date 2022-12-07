package Day09.thread;

import Day09.myThread.CountThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		new CountThread().start();
		
		System.out.println("Main Thread Over");
		
		
	}

}
