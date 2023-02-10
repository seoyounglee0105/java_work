package ch08;

public class MainTest1 {
	// 코드의 시작점 main 함수
	public static void main(String[] args) {
		
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(1);
		numberPrinter1.printwaitNumber(); // <- 누군가가
		numberPrinter1.printwaitNumber(); // <- 다른 누군가가
		numberPrinter1.printwaitNumber(); // <- 또 다른 누군가가
		
		numberPrinter2.printwaitNumber(); // <- 누군가가
		numberPrinter2.printwaitNumber(); // <- 다른 누군가가
		numberPrinter2.printwaitNumber(); // <- 또 다른 누군가가
		
	}
}
