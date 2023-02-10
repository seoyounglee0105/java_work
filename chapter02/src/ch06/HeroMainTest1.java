package ch06;

public class HeroMainTest1 {

	public static void main(String[] args) {
		
		Hero superman = new Hero();
		
		// set 메서드 사용하기
		superman.setName("슈퍼맨");
		superman.setHp(1000);
		superman.setPower(200);
		superman.setDefense(0.95);
		superman.setDie(false);
		
//		superman.showInfo();
		
		
		// get 메서드 사용하기
		System.out.println("이름 : " + superman.getName());
		System.out.println("생명력 : " + superman.getHp());
		System.out.println("공격력 : " + superman.getPower());
		System.out.println("방어력 : " + superman.getDefense());
		System.out.println("사망 여부 : " + superman.isDie());
		
	}

}
