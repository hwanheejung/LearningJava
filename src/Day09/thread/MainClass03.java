package Day09.thread;

import Day09.myThread.CountThread;

public class MainClass03 {
	public static void main(String[] args) {
		CountThread cThread = new CountThread();
		cThread.start();	// CountThread 시작 
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i*100);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("MainThread Over");
		
	}

}

// c.f) 최대한 병렬은 안쓰는게 좋다. 어떤게 먼저 실행될지 모르기 때문. 돌발상황 발생 우려. 