package factory;



public abstract class WorkFactory {
	public abstract ToyProduct createToy(String toyName);
	
	public ToyProduct produceProduct(String toyName) {
		ToyProduct product = createToy(toyName);
		product.create();
		return product;
	}
	
}
