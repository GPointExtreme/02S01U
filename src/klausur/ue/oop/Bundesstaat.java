package klausur.ue.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Bundesstaat {
	
	private ArrayList<Einwohner> einwohner = new ArrayList<>();
	
	public void add(Einwohner e) {
		einwohner.add(e);
	}
	
	public double calcSteuer() {
		double result = 0;
		for (Einwohner e : einwohner) {
			result+=e.steuer();
		}
		return result;
	}
	
	public HashMap<String, Double> calcNachBundesland(){
		HashMap<String, Double> result = new HashMap<>();
		for (Einwohner e : einwohner) {
			if(result.containsKey(e.getBundesland())) {
				double temp = result.get(e.getBundesland());
				temp=temp+e.steuer();
				result.put(e.getBundesland(), temp);
			}
			else{
				result.put(e.getBundesland(), e.steuer());
			}
		}
		return result;
	}
	
}
