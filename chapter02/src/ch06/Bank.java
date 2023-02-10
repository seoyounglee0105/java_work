package ch06;

// 접근 제어 지시자

public class Bank {
	
	// 접근 제어 지시자를 지정하지 않으면 default : 같은 패키지 내에서 접근 가능
//	int balance; // 예치금
	private int balance; // private : 같은 클래스 (.java 파일) 내에서만 접근 가능
	public String name; // public : 어디에서든지 접근 가능 (같은 프로젝트 내라면)
	
	// 기능 1 : 입금하다
	public void deposit(int money) {
		balance += money;
		System.out.println("통장에 " + money + "원을 입금합니다.");
		showInfo();
	}
	
	// 기능 2 : 출금하다
	public void withdraw(int money) {
		balance -= money;
		System.out.println("통장에서 " + money + "원을 출금합니다.");
		showInfo();
	}
	
	// 기능 3 : 계좌 잔액 확인
	public void showInfo() {
		System.out.println("현재 계좌 잔액은 " + balance + "원입니다.");
		System.out.println("=====================");
	}
	
	// get 메서드 만들기 // 코딩 컨벤션?
	// get 메서드 : read only (데이터를 주입받지 못하고 리턴만 시킴)
	public int getBalance() {// get 메서드명 규칙 : get + 앞 문자를 대문자로 한 변수명
		return this.balance;
	}
	
	// set 메서드 만들기 -> 외부에서 값을 주입받을 수 있도록 설계)
	public void setBalance(int money) {
		// 방어적 코드 작성 가능 : 값을 잘못 입력한 경우를 대비한 코드
		if (money < 0) {
			System.out.println("잘못된 입력 값입니다.");
			return; // 실행을 종료함
		}
		this.balance = money;
	}
	
	
}
