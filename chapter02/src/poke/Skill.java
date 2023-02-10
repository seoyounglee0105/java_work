package poke;

public class Skill {
	
	// 멤버변수
	String skillName; // 이름
	String type; // 타입
	int skillPower; // 위력
	double hit; // 명중
	
	// 생성자
	public Skill(String skillName, String type, int skillPower, double hit) {
		this.skillName = skillName;
		this.type = type;
		this.skillPower = skillPower;
		this.hit = hit;
	}
}
