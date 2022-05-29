package command;

public class Doll {
	private boolean dollActionOn;
	
	public void  dollActionOn() {
		System.out.println("Action for making dolls on");
		this.dollActionOn = true;
	}
	
	public void bikeActionOff() {
		System.out.println("Action for making dolls off");
		this.dollActionOn = false;
	}
}
