package Day09.myThread;

public class Brother extends Thread{
	public Wallet wallet;	// 지갑 객체
	public int money; 		// 인출한 돈 저장할 변수 
	
	public Brother(Wallet wallet){
		this.wallet = wallet;
		
	}
	
	@Override
	public void run() {
		while(true) {
			// wallet에서 돈을 인출하여 저장한다. 
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) break;	// 지갑 잔고가 0이면 
			
			money = money + returnedMoney;
			
		}
		System.out.println("Brother's 총 재산: " + money);
	}

}
