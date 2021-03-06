package api.objectclass.v1;

// java의 최상위 클래스 

public class Point {

	protected int x;
	protected int y;
	
	public Point() {
		
	}
	
	
	public Point(int x, int y) {
		System.out.println("Point 생성자");
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	

	public void draw() {
		System.out.printf("점 (%d, %d)을 그렸습니다.\n", x, y);
	}
	
	
	public void draw(boolean show) {

		String message = show ? "그렸습니다" : "지웠습니다";
		
		
		System.out.printf("점(%d, %d)을 %s\n", x, y, message);
	}
	
	// toString : print 혹은  문자열과 연결될 때 호출되어서 내용을 문자열로 반환
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
