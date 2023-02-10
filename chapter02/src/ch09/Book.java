package ch09;

public class Book {

	// 멤버변수
	private int totalPage; // 페이지 수
	private String title; // 책 제목
	private String author; // 작가명

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(int totalPage, String title, String author) {
		this(title, author);
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		return this.totalPage; // 가독성을 높이려면 this
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}
	

	// 기능 : 책 정보 출력
	public void showInfo() {
		System.out.println(">>> 책 정보 <<<");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}
	
}
