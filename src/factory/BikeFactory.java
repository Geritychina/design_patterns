package factory;

public class BikeFactory extends WorkFactory {

	@Override
	public ToyProduct createToy(String toyName) {
		if(toyName == "Balkan") {
			return new BalkanBike();
		}
		if(toyName == "Drag") {
			return new DragBike();
		}
		System.out.println("Unknown bike");
		return null;
	}

}
