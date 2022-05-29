package factory;

public class DollFactory extends WorkFactory {

	@Override
	public ToyProduct createToy(String toyName) {
		if(toyName == "Barbie") {
			return new BarbieDoll();
		}
		if(toyName == "Bratz") {
			return new BratzDoll();
		}
		System.out.println("Unknown doll");
		return null;
	}

}
