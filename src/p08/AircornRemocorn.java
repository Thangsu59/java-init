package p08;

public class AircornRemocorn extends Remocorn{
	public AircornRemocorn() {
		System.out.println("에어컨 리모콘에 배터리 넣음");
	}
	public void on() {
		System.out.println("에어컨을 킵니다.");
	}
	public void tmUp() {
		System.out.println("에어컨 온도를 올립니다.");
	}
	public void tmDown() {
		System.out.println("에어컨 온도를 내립니다.");
	}
	public void off() {
		System.out.println("에어컨을 끕니다.");
	}

}
