package oop.goods.summary;

public class SummaryApp {
	
	static Kungfu[] dojang;		// 인터페이스 참조 타입의 배열

	public static void main(String[] args) {
		// 쿵후 도장
		Panda p1 = new Panda("핑", 30);
		p1.say();
		
		Human h1 = new Human("홍길동", 28);
		h1.say();
		
		Panda p2 = new KungfuPanda("포", 15);
		p2.say();
		
		Human h2 = new TheOne("네오", 50);
		p2.say();
		
		fight(p1);
		fight(p2);
		fight(h1);
		fight(h2);
		
		
		// 각 객체를 도장에 등록
		dojang = new Kungfu[] {
//				h1,
//				h2,
				(Kungfu)p1,
				(Kungfu)p2
		};
		
		for (Kungfu actor : dojang) {
			actor.Kungfu();
		}
	}
							
	
	private static void fight(Animal actor) {
		// actor가 Kungfu 인터페이스를 구현했으면 kungfu 메서드 사용 가능
		if (actor instanceof Kungfu) {
			// Kungfu 인터페이스를 구현한 클래스이다
			// 변환이 가능
			((Kungfu)actor).Kungfu();
		} else {
			// 형변환이 불가
			System.out.println(actor.name + " : 쿵푸 못해요!");
		}
	}
}
