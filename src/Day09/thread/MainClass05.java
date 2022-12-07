package Day09.thread;

import Day09.myThread.InterThread;

/*
 * thread를 만드려면 상속을 받아야 하는데, 상속은 1개만 받을 수 있음. 
 * 다른 상속을 받아야 하는 상황이 생기면? 
 * 
 * Thread 상속 대신 Runnable interface 상속으로 thread 객체 생성. 
 * 
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		// Runnable 인터페이스를 구현한 객체 생성 
		Runnable iThread = new InterThread();
		// 생성한 객체를 Thread 객체를 생성하여 인자로 전달 
		Thread thread = new Thread(iThread);
		// Thread 객체의 start() method를 호출하면 새로운 thread가 시작된다. 
		thread.start();
		System.out.println("MainThread Over");
		
	}

}
