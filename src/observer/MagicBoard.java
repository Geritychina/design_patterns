package observer;

public class MagicBoard implements Observer {
	
	private String dwarf;
	private Observable magicboard;
	
	public MagicBoard(String dwarf) {
		this.dwarf = dwarf;
	}

	@Override
	public void update() {
		if(this.magicboard == null) {
			System.out.println("No command");
			return;
		}
		String lastCommand = this.magicboard.getUpdates();
		System.out.println(this.dwarf + "received: " + lastCommand);
		
	}

	@Override
	public void setDwarf(Observable magicboard) {
		this.magicboard = magicboard;
	}

}
