package String;

public class StringEx {

	public static void main(String[] args) {
		
		//// 1. 문자열 연결 : 문자열1.concat(문자열2)
		
			String str1 = "홍";
			String str2 = "길동";
			
			// 문자열 str1와 str2를 연결해서 출력하세요.
			System.out.println(str1.concat(str2));  // 홍길동
		
			
		//// 2. 인덱스 값으로 문자 위치 찾기 : charAt(인덱스)
		
			String str3 = "가나다라마바사";
	
			// str3에서 3번째 문자의 위치는?
			System.out.println(str3.charAt(2));  // 메서드는 인덱스 기준이므로 3-1 = 2를 넣음
			
		
		//// 3. 좌우 여백 제거 : 문자열.trim()
		
			String str4 = "가나다";
			String str5 = "   가나다 ";
			
			// 여백을 제거하여 str4와 str5가 같은 문자열이 되도록 만드세요.
			// 그리고 if문을 사용해서 같으면 "문자열이 같아요~"를 출력하세요.
			str5 = str5.trim();
			
			if (str4.equals(str5)) {
				System.out.println("문자열이 같아요~");
			} else {
				System.out.println("문자열이 달라요~");
			}
		
	}
}
