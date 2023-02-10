package ch04;

public class ForMainTest2 {

	public static void main(String[] args) {
		int num = 2;

		for (int j = num; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
		}
		
		// * 
		// ***
		// *****
		
		for ( int a = 1; a < 6; a+=2 ) {
			System.out.println("*".repeat(a));
		}
	

		

	} // end of main

} // end of class
