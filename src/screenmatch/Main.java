package screenmatch;

import model.Movie;
import model.Serie;

public class Main {

	public static void main(String[] args) {
		
		Movie encanto = new Movie();
		encanto.setName("Encanto");
		encanto.setDurationTime(120);
		encanto.setRelaseDate(2022);
		encanto.showTechnicalSheet();
		
		
		Serie friends = new Serie();
		friends.setName("Friends");
		friends.setRelaseDate(1996);
		friends.setSeasons(10);
		friends.setEpisodesPerSeason(22);
		friends.setDurationInMinutesPerEpisode(30);
		friends.showTechnicalSheet();

	}

}
