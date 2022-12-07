package Day09.myThread;

public class CountThread extends Thread {
	
	@Override
	public void run() {	 // main method 비슷 
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("CountThread 종료");
		
	}

}
