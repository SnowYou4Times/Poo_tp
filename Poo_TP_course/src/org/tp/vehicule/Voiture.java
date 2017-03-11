package org.tp.vehicule;

public class Voiture extends Vehicule{
	
	// Variables

	private String modele;
	private int vitesse;
	private String carburant;
	
	// Constructeur

	public Voiture(int cylindre, int nbrRouxMotrice, String modele, int vitesse, String carburant) {
		super(cylindre, nbrRouxMotrice);
		this.modele = modele;
		this.vitesse = vitesse;
		this.carburant = carburant;
	}
	
	
	// Getters & Setters

	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	// Methodes	
}
