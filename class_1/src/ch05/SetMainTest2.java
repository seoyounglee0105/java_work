
package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

public class SetMainTest2 {

	public static void main(String[] args) {

		HashSet<Integer> numberSet = new HashSet<>();
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());		
//		numberSet.add(getRandomNumber());		
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());
		
		// 무조건 6개의 사이즈를 갖는 numberSet 구성
//		for (int i = 0; i < 6; i++) {
//			int num = getRandomNumber();
//			if (numberSet.contains(num) == false){
//				numberSet.add(num);				
//			} else {
//				i--;
//			}
//		}
		
		int count = 0;
		while (numberSet.size() != 6) {
			numberSet.add(getRandomNumber());
			count++;
		}
		System.out.println("반복 횟수 : " + count);
		
		
		System.out.println(numberSet.size());
		System.out.println(numberSet.toString());
		
	} // end of main
	
	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}
	
}
