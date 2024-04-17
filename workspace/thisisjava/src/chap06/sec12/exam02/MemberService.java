package chap06.sec12.exam02;

public class MemberService { // 라이브러리 클래스
	boolean login = true;
	final String id = "hong";
	final String password = "12345";
	
	boolean login(String id, String password) {
		if(this.id.equals(id) && this.password.equals(password)) {
			return true; // "hong" 과 "12345"가 같으면 true 리턴
	} else {
		return false;
	}
}
	
	void logout(String id) {
		System.out.println(id + "로그아웃 되었습니다");
	}
	

	}
	


