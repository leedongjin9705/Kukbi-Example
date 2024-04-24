package chap12.sec03.exam03;

public class Smartphone {
	private String company;
	private String os;
	
	public Smartphone(String company,String os) {
		this.company = company;
		this.os = os; 
	}
	
	@Override
	public String toString() {
		return company + "," + os;
	}
	
	/* Object의 toString() 메소드를 재정의해서 제조사와 os 가 결합된 
	 * 문자열을 리턴하도록 함
	 */
	

}
