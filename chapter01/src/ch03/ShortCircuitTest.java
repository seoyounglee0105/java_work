package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		
		// 관계 논리곱 --> F --> F, 논리합 -- T -- T
		
		int num1 = 5;
		int i = 0;
		
		boolean value = ( (num1 += 10) < 10 ) && ( (i += 2) < 10);
		System.out.println(value);
		System.out.println("==============");
		System.out.println(num1);
		System.out.println(i); // 이미 앞 식이 F인 상태면 논리곱 이후 식을 계산해보지 않음 -> i+=2가 실행되지 않음
		System.out.println("==============");
		
		value = ( (num1 += 10) < 10 ) || ( (i += 2) < 10 );
		System.out.println(value);
		System.out.println(i);
		System.out.println("==============");
		
		// 문제 shortCircuit 평가 문제를 직접 2문제 만들어 주세요
		
		//  문제1.  해당 코드를 실행했을 때, 논리형 변수 a의 값과 iNum1, iNum2의 값은 무엇인가?
		int iNum1 = 2;
		int iNum2 = 10;
		
		boolean a = ( (iNum1--) < 2) && ( (iNum2 += iNum1) < 20);
		// iNum1--이므로 iNum1이 2인 상태로 조건식에 쓰였기 때문에 첫 번째 조건식은 false이다.
		// 따라서 a는 false이다.
		// shortCircuit에 의해 두 번째 조건식은 실행되지 않아 iNum2은 그대로 10이고, iNum1은 1이 되었다.
		
		System.out.println(iNum1);  // 1
		System.out.println(iNum2);  // 10 
		System.out.println(a);

		
		// 문제2. 해당 코드를 실행했을 때, 논리형 변수 b의 값과 iNum3, iNum4의 값은 무엇인가?
		int iNum3 = -1;
		int iNum4 = 3;
		
		boolean b = ( (iNum3 *= (-3)) > iNum4--) && ( (iNum4 -= 1) < 10);
		// 첫 번째 조건식에서 iNum3에 *(-1)를 해서 iNum3은 3이 되었다.
		// iNum4--이므로 iNum4는 3인 상태로 조건식에 쓰이므로, 첫 번째 조건식은 3 > 3이라서 false이다. 
		// 따라서 b는 false이다.
		
		// shortCircuit에 의해 두 번째 조건식은 실행되지 않아 iNum4 -= 1는 실행되지 않으므로,
		// iNum4--만 적용되어 iNum4는 2가 되었다.
		
		System.out.println(iNum3);  // 3
		System.out.println(iNum4);  // 2
		System.out.println(b);  // false
		
		
	}

}
