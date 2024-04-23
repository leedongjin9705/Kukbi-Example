package chap11.sec06;

public class Account {
	private long balance;
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsuffientException {
		if(balance < money) {
			throw new InsuffientException("잔고부족: " +(money-balance) + "모자람");
			// 잔고가 부족하면 InsuffientException 을 발생시키고 throws 함
		}
		balance -= money;
	}
	



}
