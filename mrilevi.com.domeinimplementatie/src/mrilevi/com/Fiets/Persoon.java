package mrilevi.com.Fiets;

public class Persoon {

	private String naam;

	/**
	 *
	 * @param naam
	 */
	public Persoon(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return this.naam;
	}

	@Override
	public String toString() {
		return naam;
	}
}