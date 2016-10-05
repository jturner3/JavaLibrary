package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CD zeppelin = new CD();
		zeppelin.play();
		zeppelin.skip();
		zeppelin.pause();
		zeppelin.turnUpToEleven(11);
		
		DVD lionKing = new DVD();
		lionKing.play();
		lionKing.skip();
		lionKing.chapterSelect(2);
		
		Bluray superman = new Bluray();
		superman.skip();
		superman.stop();
		
		lionKing.getTitle("Crazy movie about the circle of life");
		
		
	}

}
