package command;

public class Workshop {
	
    private Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		if(this.command == null) {
			System.out.println("There is no command!");
			return;
		}
		this.command.execute();
	}
}
