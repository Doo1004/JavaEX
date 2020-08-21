package api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성
		Box intBox = new Box();
		intBox.setContent(2020);
		
		// 값을 꺼내보기
		// Object이므로 다운캐스팅이 필요
		int content = (int)intBox.getContent();
		System.out.println("박스의 내용물 : " + content);
		
		Box strBox = new Box();
		strBox.setContent("Java");			// 가능(object)	
		
		// 값을 꺼내보기
		String strContent = (String)strBox.getContent();
		System.out.println("박스의 내용물 : " + strContent);
		
		// 만약 캐스팅을 잘못하면? -> 매우 위험 
//		strContent = (String)intBox.getContent();
//		System.out.println("박스의 내용물 : " + strContent);
	}
}
