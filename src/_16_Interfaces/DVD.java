package _16_Interfaces;

public class DVD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play DVD");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the DVD");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip the chapter");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Head to DVD menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause the DVD");
	}

	public void chapterSelect(int chapter){
		System.out.println("Select Chapter Start " + chapter);
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Hey my name is: " + title);
	}
}
