package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount(); // 현재 잔액 100_000
//		Father 클래스는 BankAccount에 의존하고 있다.
		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		// 아버지 입금하기
		father.start(); // 3초 걸림
		
		// 어머니 출금하기
		mother.start();
		
		// 정상 처리 시 : 10 + 1 - 0.5 = 10만 5천원
		
		
	}
	
}
