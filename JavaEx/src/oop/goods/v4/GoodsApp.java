package oop.goods.v4;

// v4
// Goods 객체를 생성하여 사용하는 클래스

public class GoodsApp {

	public static void main(String[] args) {
		
		// Goods 클래스 사용
		
		// 생성자 활용
		Goods notebook = new Goods("LG Gram", 1500000);
		
		// 메서드 호출
		notebook.showInfo();
		

		Goods smartphone = new Goods("iphone SE", 600000);
			
		smartphone.showInfo();
	}

}
