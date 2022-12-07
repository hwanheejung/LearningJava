package Day09.myThread;

// Thread 객체를 만드려면 Thread 객체 상속 
public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread만의 작업 시작");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThread 작업 종료");
		
	}
}
