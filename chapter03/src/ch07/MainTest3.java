package ch07;

public class MainTest3 {

	public static void main(String[] args) {

		Student student1 = new Student("홍길동");
		Student student2 = new Student("김철수");
		Student student3 = new Student("홍길동");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		// 객체에 존재하는 각각의 equals 메서드를 호출한 것
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		
		System.out.println(student1.hashCode());		
		System.out.println(student2.hashCode());		
		System.out.println(student3.hashCode());		
	}

}
