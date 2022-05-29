package command;

public class DollNeed implements Command {
	public Doll doll;
	
	public DollNeed(Doll doll) {
		this.doll = doll;
	}

	@Override
	public void execute() {
		this.doll.dollActionOn();
	}
	
	
}
