package Day09.myThread;

public class Wallet {
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	// synchronized: Thread safe method. 동시에 접근 못하게 막는것 
	// 				 동기화 시켜주는 예약어 
	public synchronized int getMoney() {
		
		if(totalMoney  == 0) return 0;
		
		totalMoney = totalMoney - 1;
		System.out.println("현재 지갑의 금액: " + totalMoney);
		return 1;
		
	}

}
