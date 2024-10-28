package model;


import java.util.Scanner;

import calculate.Classifiable;

public class Movie extends Title implements Classifiable{


	private String director;
	private String genre;



	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	
	public int getClassifiable() {
		return (int) (average() / 2);
	}


	public Movie(String name, int relaseDate) {
		super(name, relaseDate);
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

        System.out.println("Gender: ");
        String _genre = keyboard.nextLine();

        Movie userMovie = new Movie(_name, _durationTime);
        userMovie.setName(_name);
        userMovie.setReleaseDate(_releaseDate);
        userMovie.setDurationTime(_durationTime);
        userMovie.setDirector(_director);
        userMovie.setGenre(_genre);

        return userMovie;
    }

@Override
public void showTechnicalSheet() {
	super.showTechnicalSheet();
	System.out.println("The name of the director: " + this.getDirector());
	System.out.println("Movie genre: " + this.getGenre());
}
}



