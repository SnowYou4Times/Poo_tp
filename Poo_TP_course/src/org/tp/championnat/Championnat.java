package org.tp.championnat;

import java.util.List;

import org.tp.course.Course;
import org.tp.interfaces.ChampionnatItf;

public class Championnat implements ChampionnatItf{

	// Variables
	private List<Course> listCourse;
	private int nombreEtape;
	
	// Getters & Setters
	public List<Course> getListCourse() {
		return listCourse;
	}
	public void setListCourse(List<Course> listCourse) {
		this.listCourse = listCourse;
	}
	public int getNombreEtape() {
		return nombreEtape;
	}
	public void setNombreEtape(int nombreEtape) {
		this.nombreEtape = nombreEtape;
	}
	
	// Methodes


	
}
