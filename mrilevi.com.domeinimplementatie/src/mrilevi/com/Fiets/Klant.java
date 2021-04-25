package mrilevi.com.Fiets;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

public class Klant extends Persoon {

	private Double budget;
	private Aankoop aankoop;
	private ArrayList<Aankoop> aankopen;
	private Ebike ebike;
	private Service service;
	private Fiets fiets;

	/**
	 * 
	 * @param naam
	 * @param budget
	 */
	public Klant(String naam, Double budget) {
		super(naam);
		this.budget = budget;
	}

	public Double getBudget() {
		return this.budget;
	}

	@Override
	public String toString() {
		return "Klant met naam: " + super.toString() +
				", en budget: €" + budget;
	}
	public boolean koopfiets(Fiets fiets) {
		if (budget > fiets.getPrijs() + ebike.getPrijs() + service.getPrijs()){
			if(fiets != null){aankopen.add(fiets)}
		}
	}
}