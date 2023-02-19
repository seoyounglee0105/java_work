package ch02;


// 공유하는 자원으로 만들기 (SharedResource 상황 구현)
public class BankAccount {
	int money = 100_000;

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 입금
	// synchronized 메서드
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}
	
	// 출금
	public int widthDraw(int money) {
		
		// synchronized 블록 (메서드나 블록 둘 중 하나 선택)
		// 블록 내 코드에 동기화를 진행함
		synchronized (this) {
			int currentMoney = getMoney();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("잘못된 입력입니다.");
				return 0;
			}			
		}
	}
}

// 쓰레드 클래스 1
class Father extends Thread {
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금 시키기
		account.saveMoney(10_000);
	}
	
}
	
// 쓰레드 클래스 2
class Mother extends Thread {
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.widthDraw(5_000);
	}
	
}