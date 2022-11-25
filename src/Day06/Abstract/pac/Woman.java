package Day06.Abstract.pac;
/*
 * 상속받는 방법
 * class 자식클래스명 extends 부모클래스명 
 * 
 * 
 */
public class Woman extends Human{
	
	@Override // Override : 부모 메소드 재정의 
	public void think() {
		System.out.println("I can think");
		
	}

}
