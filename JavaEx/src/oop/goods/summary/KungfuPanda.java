package oop.goods.summary;

public class KungfuPanda extends Panda implements Kungfu {
	
		// 생성자
		public KungfuPanda(String name, int age) {
			super(name, age);
		}
		
		@Override
		public void Kungfu() {
			System.out.printf("%s : 아뵤~\n", name);
		}
		
	}
	
	
	// 추상 메서드는 반드시 오버라이드
	// say는 Animal의 추상 메서
