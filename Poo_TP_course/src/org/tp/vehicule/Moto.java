package org.tp.vehicule;

public class Moto extends Vehicule{

	// Variables
	
	private String type;
	private double poids;
	
	// Constructeur
	
	public Moto(int cylindre, int nbrRouxMotrice, String type, double poids) {
		super(cylindre, nbrRouxMotrice);
		this.type = type;
		this.poids = poids;
	}
	
	// Getters & Setters

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	// Methodes
}
