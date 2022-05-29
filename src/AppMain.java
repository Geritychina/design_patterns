import command.Bike;
import command.BikeNeed;
import command.Command;
import command.Doll;
import command.DollNeed;
import command.Workshop;
import factory.BikeFactory;
import factory.DollFactory;
import factory.ToyProduct;
import factory.WorkFactory;
import observer.Dwarf;
import observer.MagicBoard;
import observer.Observer;
import singleton.Singleton;

public class AppMain {

	public static void main(String[] args) {
		//Singleton Santa
		Singleton connection = Singleton.getInstance();
		connection.santaMessage("");
		
		System.out.println("--------------------------------------------------------");
		
		//Factory Method
		WorkFactory dollFactory = new DollFactory();
		
		ToyProduct doll = dollFactory.produceProduct("Barbie");
		
		WorkFactory bikeFactory = new BikeFactory();
		
		ToyProduct bike = bikeFactory.produceProduct("Drag");
		
		System.out.println("--------------------------------------------------------");
		
		//Observer
		
		Dwarf magicboard  = new Dwarf();
		
		Observer ob1 = new MagicBoard("Command1 ");
		Observer ob2 = new MagicBoard("Command2 ");
		Observer ob3 = new MagicBoard("Command3 ");
		
		
		magicboard.subscribe(ob1);
		magicboard.subscribe(ob2);
		
		magicboard.setDwarf("Make dolls");
		magicboard.unsubscribe(ob1);
		
		magicboard.setDwarf("Make Bikes");
		magicboard.unsubscribe(ob2);
		
		System.out.println("------------------------------------------------------");
		
		
		//Command
		
		Bike bikes = new Bike();
		Doll dolls = new Doll();
		
		Command dollActionOn = new DollNeed(dolls);
		Command bikeActionOn = new BikeNeed(bikes);
		
		Workshop workshopremote = new Workshop();
		
		workshopremote.setCommand(dollActionOn);
		workshopremote.pressButton();
		
		workshopremote.setCommand(bikeActionOn);
		workshopremote.pressButton();
		
		System.out.println("--------------------------------------------------------------------------");
		
		
		
	}

}
