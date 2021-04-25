package mrilevi.com.Fiets;

public class Ebike extends Fiets {

	private String motorType;
	private String accuType;

	public String getMotorType() {
		return this.motorType;
	}

	public String getAccuType() {
		return this.accuType;
	}

	/**
	 * 
	 * @param type
	 * @param prijs
	 * @param accuType
	 * @param motorType
	 */
	public Ebike(String type, Double prijs, String accuType, String motorType) {
		super(type, prijs);
		this.motorType = motorType;
		this.accuType = accuType;
	}

	@Override
	public String toString() {
		return "Elektrische " + super.toString() +
				" met motortype: " + motorType +
				" en accutype: " + accuType;
	}
}