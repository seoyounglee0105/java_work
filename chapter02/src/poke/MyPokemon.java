package poke;

public class MyPokemon {
	
	// 멤버변수
	String nickname; // 별명
	Pokemon pokemon; // 포켓몬 종류
	int hp; // 생명력
	int power; // 공격력
	int speed; // 속도
	Skill nomalSkill; // 노말 속성 스킬
	Skill myTypeSkill; // 자기 속성 스킬
	
	// 생성자
	public MyPokemon(String nickname, Pokemon pokemon, int hp, int power, 
			int speed,	Skill nomalSkill, Skill myTypeSkill) {
		this.nickname = nickname;
		this.pokemon = pokemon;
		this.hp = hp;
		this.power = power;
		this.speed = speed;
		this.nomalSkill = nomalSkill;
		this.myTypeSkill = myTypeSkill;
	}
	
}
