package mrilevi.com.Fiets;

import com.sun.istack.internal.Nullable;

public class Aankoop {
	private Klant klant;
	private Verkoper verkoper;
	private Fiets fiets;
	private Ebike ebike;
	private Service service;
	/**
	 * 
	 * @param Klant
	 * @param Verkoper
	 * @param Fiets
	 * @param Ebike
	 * @param Service
	 */
	public Aankoop(Klant klant, Verkoper verkoper, @Nullable Fiets fiets, @Nullable Ebike ebike, @Nullable Service service) {
		this.klant = klant;
		this.verkoper = verkoper;
		this.fiets = fiets;
		this.ebike = ebike;
		this.service = service;
	}

}