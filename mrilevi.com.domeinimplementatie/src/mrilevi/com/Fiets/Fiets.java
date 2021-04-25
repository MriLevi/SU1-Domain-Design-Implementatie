package mrilevi.com.Fiets;

public class Fiets implements Koopbaar {

	private String type;
	private Double prijs;

	/**
	 * 
	 * @param type
	 * @param prijs
	 */
	public Fiets(String type, Double prijs) {
		this.type = type;
		this.prijs = prijs;
	}

	public String getType() {
		return this.type;
	}

	public Double getPrijs() {
		return this.prijs;
	}

	@Override
	public String toString() {
		return "Fiets van het type " + type + ", prijs: €" + prijs;
	}
}