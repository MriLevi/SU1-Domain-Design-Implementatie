package mrilevi.com.Fiets;

public class Service implements Koopbaar {

	private String type;
	private Double prijs;

	/**
	 * 
	 * @param type
	 * @param prijs
	 */
	public Service(String type, Double prijs) {
		this.type = type;
		this.prijs = prijs;
	}

	public String getType() {
		return this.type;
	}

	public Double getPrijs() {
		return this.prijs;
	}

}