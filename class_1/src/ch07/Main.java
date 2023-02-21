package ch07;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// 문제
		// d object에  있는 value 값과 arrayList 값을 출력해주세요
		System.out.println(a.b.c.d.value);
		
		for (String s : a.b.c.d.arrayList) {
			System.out.println(s);			
		}
		
	}
	
}
