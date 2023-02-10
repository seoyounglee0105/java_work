package ch01;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		Student studentA = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 이름은?");
		studentA.studentName = sc.nextLine();
		System.out.println("학생의 학번은?");
		studentA.studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("학생의 주소는?");
		studentA.address = sc.nextLine();
		
		studentA.homework();
		studentA.test();
		studentA.clean();

	}

}
