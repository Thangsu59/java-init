package p07;

public class GameExe {

	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
	public static void main(String[] args) {
		Fifa fifa=new Fifa();
		fifa.name="피파";
		fifa.price=0;
		fifa.genre="스포츠";
		
		Fm fm=new Fm();
		fm.name="풋볼매니저";
		fm.price=30000;
		fm.genre="스포츠";
		
		runGame(fifa);
		runGame(fm);
	}

}
