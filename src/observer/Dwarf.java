package observer;

import java.util.ArrayList;
import java.util.List;

public class Dwarf implements Observable {
	
	private List<Observer> observers;
	private String magicboard;
	
	public Dwarf() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setDwarf(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setDwarf(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdates() {
		return this.magicboard;
	}
	
	public void setDwarf(String command) {
		this.magicboard = command;
		this.notifyObservers();
	}

}
