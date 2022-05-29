package command;

public class Bike {
	
private boolean bikeActionOn;
	
	public void  bikeActionOn() {
		System.out.println("Action for making bikes on");
		this.bikeActionOn = true;
	}
	
	public void bikeActionOff() {
		System.out.println("Action for making bikes off");
		this.bikeActionOn = false;
	}
}
