package api;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스와 Calendar 클래스를 연습			ctrl + shift + o
public class DateEx {

	public static void main(String[] args) {
		// 날짜 데이터의 획득
		Date now = new Date();				// 현재 날짜와 시간
		String nowStr = now.toString();		// date 안쪽에 있는 출력부
		
		System.out.println("현재 날짜 : " + nowStr);
		System.out.println("현지화 된 날짜 : " + now.toLocaleString());		// Deplecated된 메서드는 사라질 메서드 -> 빠른 시간 내에 다른 방식으로 교체 필요
		
		// 형식화된 출력 : DateFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FUll 포맷 : " + df.format(now));
		
		// FULL, Long, MEDIUM, SHORT
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG 포맷 : " + df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT 포맷 : " + df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM 포맷 : " + df.format(now));
		
		// 자유로운 날짜 데이터 포매팅
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF : " + sdf.format(now));
	}
}
