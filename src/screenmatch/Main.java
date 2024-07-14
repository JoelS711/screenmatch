package screenmatch;

import model.Movie;

public class Main {

	public static void main(String[] args) {
		
		Movie encanto = new Movie();
		encanto.setName("Encanto");
		encanto.setDurationTime(120);
		encanto.setRelaseDate(2022);
		encanto.showTechnicalSheet();

	}

}
