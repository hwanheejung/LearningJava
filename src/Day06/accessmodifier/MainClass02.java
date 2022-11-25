package Day06.accessmodifier;

import Day06.mypac.MemberVO;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * id : jhh117 
		 * password : jhh1234
		 * name : hwanhee
		 * phone : 010-1234-5678
		 * address : Seoul, Korea
		 * birth : 020117
		 */
		MemberVO memberVO = new MemberVO();
		memberVO.setId("jhh117");
		memberVO.setPw("jhh1234");
		memberVO.setName("hwanhee");
		memberVO.setPhoneNumber("010-1234-5678");
		memberVO.setAddy("Seoul, Korea");
		memberVO.setBirth("020117");
		
		String id = memberVO.getId();
		String pw = memberVO.getPw();
		String name = memberVO.getName();
		String phoneNumber = memberVO.getPhoneNumber();
		String addy = memberVO.getAddy();
		String birth = memberVO.getBirth();
		
		System.out.println("ID: " + id);
		System.out.println("Password: " + pw);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("Address: " + addy);
		System.out.println("Birth: " + birth);
	}

}
