package model;

public class Movie {

	private String name;
	private int relaseDate;
	private double qualification;
	private String synopsis;
	private int durationTime;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRelaseDate() {
		return relaseDate;
	}



	public void setRelaseDate(int relaseDate) {
		this.relaseDate = relaseDate;
	}



	public double getQualification() {
		return qualification;
	}



	public void setQualification(double qualification) {
		this.qualification = qualification;
	}



	public String getSynopsis() {
		return synopsis;
	}



	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}



	public int getDurationTime() {
		return durationTime;
	}



	public void setDurationTime(int durationTime) {
		this.durationTime = durationTime;
	}



	public void showTechnicalSheet() {
		System.out.println("***FICHA TECNICA***");
		System.out.println("Name of the movie: " + name);
		System.out.println("Relase date: " + relaseDate);
		System.out.println("Duration time in minutes: " + durationTime);
	}
}
