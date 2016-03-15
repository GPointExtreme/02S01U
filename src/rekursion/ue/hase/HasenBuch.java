package rekursion.ue.hase;

public class HasenBuch {

	public static void main(String[] args) {
		lesen(3);
	}
	
	public static void lesen (int tiefe) {
		if (tiefe == 0) {
			System.out.println("Ein Hase, ...");
			return;
		}
		System.out.println("Ein Hase, der gern Bücher las, fand ein dickes Buch im Gras,");
		System.out.println("er setzte sich ins Gras und las das dicke Buch,");
		System.out.println("im Buch stand das:");
		tiefe--;
		lesen(tiefe);
	}
}
