package Day06.Abstract.pac;

public class Man extends Human{
	
	@Override
	public void talk() {
		super.talk();
		System.out.println("I have a deep voice");
	}
	@Override
	public void think() {
		System.out.println("I can think!");
	}
}
