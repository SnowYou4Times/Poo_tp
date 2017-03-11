package org.tp.vehicule;

import org.tp.interfaces.VehiculeItf;

public abstract class Vehicule implements VehiculeItf{

	// Variables
	
	private int cylindre;
	private int nbrRouxMotrice;
	
	// Constructeur
	public Vehicule(int cylindre, int nbrRouxMotrice) {
		this.cylindre = cylindre;
		this.nbrRouxMotrice = nbrRouxMotrice;
	}
	
	// Getters & Setters
	
	public int getCylindre() {
		return cylindre;
	}
	public void setCylindre(int cylindre) {
		this.cylindre = cylindre;
	}
	public int getNbrRouxMotrice() {
		return nbrRouxMotrice;
	}
	public void setNbrRouxMotrice(int nbrRouxMotrice) {
		this.nbrRouxMotrice = nbrRouxMotrice;
	}
	
	// Methodes
}
