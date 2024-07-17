package model;

public class Movie extends Title{

	private String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

public static Movie getMovieDetailsFromUser() {
        System.out.println("Enter the name of the movie: ");
        String _name = keyboard.nextLine();
        
        System.out.println("Enter the release date: ");
        int _releaseDate = keyboard.nextInt();
        keyboard.nextLine(); // clear the buffer
        
        System.out.println("Enter the length of the movie in minutes: ");
        int _durationTime = keyboard.nextInt();
        keyboard.nextLine(); // clear the buffer
        
        Movie userMovie = new Movie();
        userMovie.setName(_name);
        userMovie.setReleaseDate(_releaseDate);
        userMovie.setDurationTime(_durationTime);
        
        return userMovie;
    }
}
	
	
}
