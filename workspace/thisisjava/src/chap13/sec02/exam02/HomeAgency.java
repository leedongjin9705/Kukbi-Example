package chap13.sec02.exam02;

// HomeAgency 는 Home 을 렌트해 주는 대리점 클래스
public class HomeAgency implements Rentable<Home>{
	// 타입 파라미터 T대신 Home 으로 대체함
@Override
public Home rent() {
	return new Home();
}
}
