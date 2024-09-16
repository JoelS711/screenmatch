package model;

public class Title {

	private String name;
	private int relaseDate;
	private double qualification;
	private String synopsis;
	private int durationTime;
	private double sumOfScores;
	private double totalScores;
	


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

	public double getSumOfScores() {
		return sumOfScores;
	}



	public double getTotalScores() {
		return totalScores;
	}

	

	public Title(String name, int relaseDate) {
		super();
		this.name = name;
		this.relaseDate = relaseDate;
	}



	public void showTechnicalSheet() {
		System.out.println("***FICHA TECNICA***");
		System.out.println("Name of the title: " + this.name);
		System.out.println("Relase date: " + this.relaseDate);
		System.out.println("Duration time in minutes: " + this.getDurationTime());
	}
	
	public void evaluate(double score) {
		sumOfScores += score;
		totalScores ++;
	}
	
	public double average() {
		return sumOfScores / totalScores;
	}
	
}
