package ch01;

public class MainTest4 {

	// 코드의 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;  // 스택 메모리에
		int n2 = 100;  // 스택 메모리에
		Student studentPack = new Student();  // new 키워드를 만나면 heap 메모리에 studentPack 객체와 멤버변수가 할당됨
		                                                                        // 스택 메모리에는 studentPack의 주솟값이 할당됨
		studentPack.studentId = 1;  // heap 메모리에 있는 객체의 멤버변수 값이 초기화됨
		
		////////////////////////
		
		Student studentKim = new Student();  // heap 메모리에 멤버변수가 할당됨
		studentKim.studentId = 100;  // heap 메모리에 있는 studentId 멤버변수에 접근해서 100으로 초기화함
		
		
		
	} // end of main

} // end of class
