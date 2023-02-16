package ch04Ex;

public class Cooker<T extends Food> {

	private T food;

	public T getFood() {
		return food;
	}

	public void setFood(T food) {
		this.food = food;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
