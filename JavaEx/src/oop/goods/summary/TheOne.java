package oop.goods.summary;

public class TheOne extends Human implements Flyable, Kungfu{
	// 부모 클래스는 1개여야 하지만 인터페이스는 여러 개일 수 있다
	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void Kungfu() {
		System.out.println(name + " : I know Kungfu!");
	}

	@Override
	public void fly() {
		System.out.println(name + " : I believe I can fly!");
	}
	
}
