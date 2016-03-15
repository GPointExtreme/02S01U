package klausur.ue.oop;

public abstract class Einwohner {
	
	private int einkommen;
	private String bundesland;
	
	public Einwohner(int einkommen, String bundesland) {
		super();
		this.einkommen = einkommen;
		this.bundesland = bundesland;
	}
	
	public int getEinkommen() {
		return einkommen;
	}

	public String getBundesland() {
		return bundesland;
	}

	public abstract double steuer();

}
