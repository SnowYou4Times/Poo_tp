package org.tp.pilote;

import org.tp.interfaces.PiloteItf;

public class Pilote implements PiloteItf{

	// Variables
	private String nom;
	private String prenom;
	private String nationalite;
	private int age;
	private boolean aPermisVoiture;
	private boolean aPermisMoto;
	
	// Constructeur
	
	public Pilote(String nom, String prenom, String nationalite, int age, boolean aPermisVoiture, boolean aPermisMoto){
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.age = age;
		this.aPermisVoiture = aPermisVoiture;
		this.aPermisMoto = aPermisMoto;
	}
	
	public Pilote(String prenom, String nationalite, int age, boolean aPermisVoiture, boolean aPermisMoto){
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.age = age;
		this.aPermisVoiture = aPermisVoiture;
		this.aPermisMoto = aPermisMoto;
	}
	
	// Getters & Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isaPermisVoiture() {
		return aPermisVoiture;
	}
	public void setaPermisVoiture(boolean aPermisVoiture) {
		this.aPermisVoiture = aPermisVoiture;
	}
	public boolean isaPermisMoto() {
		return aPermisMoto;
	}
	public void setaPermisMoto(boolean aPermisMoto) {
		this.aPermisMoto = aPermisMoto;
	}
	
	// Methodes
}
