package singleton;

public class Singleton {
	
	private static Singleton instance;
	
    private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void santaMessage(String message) {
		System.out.println("I need dolls " + message);
		System.out.println("I need bicycles " + message);
	}

}
