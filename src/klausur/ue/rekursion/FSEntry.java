package klausur.ue.rekursion;

public abstract class FSEntry {

	private String name;

	public FSEntry(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public abstract void print();
	
}
