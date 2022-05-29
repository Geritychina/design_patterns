package command;

public class BikeNeed implements Command {
	public Bike bike;
	
	public BikeNeed(Bike bike) {
		this.bike = bike;
	}

	@Override
	public void execute() {
		this.bike.bikeActionOn();
	}
	
	
}
