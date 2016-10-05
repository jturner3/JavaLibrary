package _16_Interfaces;

public class Bluray implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Start Bluray player.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop Bluray Player");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip Bluray Chapter");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("BlueRay Menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause BlueRay player.");
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Hey my name is: " + title);
	}

}
