package model;

import java.util.Scanner;

public class Movie extends Title{

	private String director;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

public static Movie getMovieDetailsFromUser(Scanner keyboard) {
        System.out.println("Enter the name of the movie: ");
        String _name = keyboard.nextLine();
        
        System.out.println("Enter the release date: ");
        int _releaseDate = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter the length of the movie in minutes: ");
        int _durationTime = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter the name of the director: ");
        String _director = keyboard.nextLine();
        keyboard.nextLine();
        
        Movie userMovie = new Movie();
        userMovie.setName(_name);
        userMovie.setRelaseDate(_releaseDate);
        userMovie.setDurationTime(_durationTime);
        userMovie.setDirector(_director);
        
        return userMovie;
    }
}
	
	

