package Step5_method;

class Account1{
	private String accountNo,ownerName;
	private int balance;
	Account1(){}
	Account1(String accountNo, String onwerName, int balance){
		this.accountNo=accountNo; this.ownerName=onwerName; this.balance=balance;
	}
	void deposit(int amt) {
		balance+=amt;
	}
	void withdraw(int amt) {
		if(balance>amt) {
			balance-=amt;
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
	void withdraw() {
		balance-=1000; //천원출금할때
	}
	int getBal() {
		return balance;
	}
}

public class M3_AcccountEx {

	public static void main(String []args) {
		
		Account1 ac1 = new Account1("12435", "홍길동", 10000);
		Account1 ac2 = new Account1("21312", "이순신", 20000);
		
		ac1.deposit(100000);
		ac1.withdraw(2000);
		System.out.println(ac1.getBal());
	}
	
}
