package klausur.ue.oop;

public class Landwirt extends Einwohner {
	
	private int flaeche;

	public Landwirt(int flaeche, String bundesland) {
		super(flaeche*100, bundesland);
	}

	@Override
	public double steuer() {
		return getEinkommen()*0.225;
	}

}
