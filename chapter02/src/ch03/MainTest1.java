package ch03;

// 객체 지향 프로그래밍이란 ***
// 객체와 객체 간에 관계를 형성하고 상호작용하게 코드를 설계해나가는 것

public class MainTest1 {

	public static void main(String[] args) {

		// 생성자를 이용해서 객체 생성
		
		// 1번, 3학년, 홍길동
		Student studentHong = new Student(1, 3, "홍길동");
		
		// 변수로 접근해서 데이터 추가
		studentHong.korea.subjectName = "국어"; // 오류 발생
		// 문법적 오류는 없음 (컴파일 시점에는 오류를 확인할 수 없는 상태였음)
		// -> 실행 시점에 오류 확인 : java.lang.NullPointerException
		// 원인 1 : new를 안해서 메모리에 로드되지 않아 사용하지 못함
		// 원인 2: . 연산자를 잘못 사용함
		
		// -> 해결 방안 1) 클래스 내부에서 초기화 (this.korea = new Subject();)  
		//                       2) 클래스 외부에서 초기화
		studentHong.korea.score = 90;
		
		
		// 확인
		studentHong.showInfo();
//		System.out.println(studentHong.korea);
		
		// 이순신에 과목 이름 국어, 수학 입력, 
		// 이순신에 과목 점수 국어 100, 수학 5점 입력 후 출력
		// 2번, 3학년, 이순신
		Student studentLee = new Student(2, 3, "이순신");
				
		studentLee.korea.subjectName = "국어";
		studentLee.math.subjectName = "수학";
		
		studentLee.korea.score = 100;
		studentLee.math.score = 5;
		
		studentLee.showInfo();
		
		
		
		
		
	}

}
