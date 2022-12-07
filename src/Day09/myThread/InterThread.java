package Day09.myThread;

public class InterThread implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread Start");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("InterThread Over");
	}

}
