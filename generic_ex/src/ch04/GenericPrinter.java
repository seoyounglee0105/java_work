package ch04;

// Material을 상속받은 클래스 타입만 허용함
public class GenericPrinter<T extends Material> {
	// 선택 후, 알트 + 쉬프트 + R => 코드 이름 변경
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
