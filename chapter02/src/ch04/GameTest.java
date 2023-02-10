package ch04;

public class GameTest {

	public static void main(String[] args) {
		
		Warrior war1 = new Warrior("전사");
		
		
		
		
		
		war1.userInfo();
		war1.monsterAttack(10);
		war1.userAttack("베기");
		war1.monsterAttack(40);		
		war1.userAttack("내려찍기");
		war1.userAttack("평타");
		war1.win(5); // 5마리 잡아서 레벨업함
//		war1.userInfo();
		
	}

}
