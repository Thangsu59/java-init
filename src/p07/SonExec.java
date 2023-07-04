package p07;

class Song{
	public int rank;
	public String title;
	public void printTitle() {
		System.out.println("노래 제목 : "+title);
	}
	
}
public class SonExec {

	public static void main(String[] args) {
		Son s=new Son();
		s.name="동동";
		s.job="개발자";
		s.age=30;
		s.hobby="게임";
		s.printJob();
		s.printHobby();
		
	}

}
