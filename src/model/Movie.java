package model;

import calculate.Classifiable;

public class Movie extends Title implements Classifiable{

	private String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public int getClassifiable() {
		return (int) (average() / 2);
	}
	
	
}
