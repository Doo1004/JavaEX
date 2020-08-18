package oop.goods.casting;

public class Animal {
	// 필드
	protected String name;		// 자식에게 물려줬을 때 자식도 사용할 수 있도록 protected
	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	
	// 메서드
	public void eat() {
		System.out.println(name + "이 먹고 있다");
	}
	
	public void walk() {
		System.out.println(name + "이 걷고 있다");
	}
}
