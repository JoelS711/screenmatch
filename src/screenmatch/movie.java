package screenmatch;

public class Movie {

	String name;
	int relaseDate;
	double qualification;
	String synopsis;
	int durationTime;
	
	
	void showTechnicalSheet() {
		System.out.println("***FICHA TECNICA***");
		System.out.println("Name of the movie: " + name);
		System.out.println("Relase date: " + relaseDate);
		System.out.println("Duration time in minutes: " + durationTime);
	}
}
