package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);
		
		// 아버지 입금하기
		father.start(); // 3초 걸림
		
		// 어머니 출금하기
		mother.start();
		
	}
}
