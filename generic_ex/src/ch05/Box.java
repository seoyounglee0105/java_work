package ch05;

public class Box<T extends Toy> {
	
	private T contents;
	
	public Box(){
		this.contents = null;
	}
	
	
	// 넣다
	public void put(T item) {
		this.contents = item;
		
	}
	
	// 꺼내다
	public T take() {
		T item = this.contents;
		this.contents = null;
		return item;
	}
	
	public boolean isEmpty() {
		return (this.contents == null);
	}
	
	
}
