package klausur.ue.oop;

public class Kuenstler extends Einwohner {
	
	private int einmalerloes;

	public Kuenstler(int einmalerloes, int einkommen, String bundesland) {
		super(einkommen, bundesland);
		this.einmalerloes = einmalerloes;
	}

	@Override
	public double steuer() {
		double steuer = einmalerloes*0.02+getEinkommen()*0.25;
		if(steuer<100)
			steuer = 100;
		return steuer;
	}

}
