package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {
		
		Human human = new Human();
		// 스캐너를 활용해서 값을 할당해주세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름은?");
		human.name = sc.nextLine();
		System.out.println("키는?");
		human.height = sc.nextInt();
		sc.nextLine();
		System.out.println("몸무게는?");
		human.weight = sc.nextInt();
		sc.nextLine();
		System.out.println("남자인가? (true or false)");
		human.isMan = sc.nextBoolean();
		
		// 마지막에는 showInfo 메서드를 호출해서 값을 확인해주세요
		// 심화 : 스캐너를 통해 호출하는거 (0 입력 시 호출)
		
		int showY = -1;
		System.out.println("정보를 보고 싶다면 0을 입력해주세요");
		
		while (showY != 0) {
			showY = sc.nextInt();
			sc.nextLine();		
		}
		human.showInfo();
		

	} // end of main

} // end of class
