package oop.goods.v2;

// v1
// Goods 객체를 생성하여 사용하는 클래스

public class GoodsApp {

	public static void main(String[] args) {
		
		// Goods 클래스 사용
		
		Goods notebook = new Goods();	// 인스턴스화
		
		// 필드에 접근
		// name, price 필드는 private 이므로 접근 불가(은닉)
		
		/*
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		System.out.printf("%s, %d원\n", notebook.name, notebook.price);
		*/
		
		// setter를 이용한 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		// 메서드 호출
		notebook.showInfo();
		
		Goods smartphone = new Goods();
		
		/*smartphone.name = "iphone SE";
		smartphone.price = 600000;
		
		
		System.out.printf("%s, %d원\n", smartphone.name, smartphone.price);
		*/
		
		smartphone.setName("아이폰 SE");
		smartphone.setPrice(700000);
		
		smartphone.showInfo();
	}

}
