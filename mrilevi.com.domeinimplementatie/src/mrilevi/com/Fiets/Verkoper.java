package mrilevi.com.Fiets;

public class Verkoper extends Persoon {

	/**
	 * 
	 * @param naam
	 */
	public Verkoper(String naam) {
		super(naam);
	}

	@Override
	public String toString() {
		return "Verkoper: " + super.toString();
	}
}