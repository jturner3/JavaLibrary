package _16_Interfaces;

public class CD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD is stopped.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("CD is skipped");
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Show CD Menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause movie");
	}
	
	public void turnUpToEleven(int volume){
		System.out.println("Turn that up to " + volume);
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Hey my name is: " + title);
	}
}
