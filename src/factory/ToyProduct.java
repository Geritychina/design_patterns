package factory;

public abstract class ToyProduct {
	
    private String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void create();
	
}
