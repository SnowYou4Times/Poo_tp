package org.tp.course;

import org.tp.interfaces.CourseItf;

public class Course implements CourseItf{

	// Variables
	private String typeRequis;
	private String categorieRequis;
	private int cylindreRequis;
	private int date;
	
	// Setters & Getters
	public String getTypeRequis() {
		return typeRequis;
	}
	public void setTypeRequis(String typeRequis) {
		this.typeRequis = typeRequis;
	}
	public String getCategorieRequis() {
		return categorieRequis;
	}
	public void setCategorieRequis(String categorieRequis) {
		this.categorieRequis = categorieRequis;
	}
	public int getCylindreRequis() {
		return cylindreRequis;
	}
	public void setCylindreRequis(int cylindreRequis) {
		this.cylindreRequis = cylindreRequis;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	// Methodes
}
