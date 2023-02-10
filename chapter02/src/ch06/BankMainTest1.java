package ch06;

import java.util.Currency;

public class BankMainTest1 {

	public static void main(String[] args) {
		
		Bank bankB = new Bank(); // 같은 패키지라서 import X
		
		bankB.deposit(10_000);
		bankB.withdraw(6_000);
		
		// 실수로 메서드를 이용하지 않고 멤버변수에 접근해서 수정해버린 경우
//		bankB.balance = 100_000;
		// 외부에서 멤버변수의 값을 수정할 수 있게 하면 실수할 가능성이 생김
		// -> 예방 : 접근 제어 지시자 할당 (private)
		// -> 외부에서 접근 불가
		
		// private이 할당된 변수에 대한 정보만 받고 싶다면? (get - read only)
		// 현재 계좌 잔액을 지역변수에 담아보기
		int currentMoney = bankB.getBalance();
		System.out.println("currentMoney : " + currentMoney);
		
		// private이 할당된 변수에 대해 수정이 필요하다면? (set)
		bankB.setBalance(200_000);
		bankB.showInfo();
		
		// 멤버변수와 메서드의 차이점
		// 메서드 : 실행의 흐름을 추가할 수 있음 -> 방어적 코드를 위해 set 메서드 사용
		
		
		
	} // end of main

} // end of class
