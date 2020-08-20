package api.objectclass.v5;

import java.util.Arrays;

// v5. 참조 타입 필드를 가진 객체의 복사(깊은 복제)
public class Scoreboard implements Cloneable{
	// 필드 : 참조 타입
	// 깊은 복제를 위해서는 참조타입의 필드도 복제해 분리해주어야 한다
	private int scores[];		// 정수 배열
	
	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	// getters/setters
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	// 복제 메서드
	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
		clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("복제를 지원하지 않음");
		}
		return clone;
	}

	// 출력을 위한 toString 오버라이드
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Scoreboard clone = (Scoreboard)super.clone();		// 부모가 가진 메서드를 이용하여 일단 얕은 복제(Object의 복제)
		// 내부 참조 필드를 복제
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}
}
