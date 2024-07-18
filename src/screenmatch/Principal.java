package screenmatch;

import java.util.Scanner;

import model.Movie;

public class Principal {

	public void showTheMenu() {
		int option = 0;
		Scanner keyboard = new Scanner(System.in);
		while (option != 9) {
			String menu = "Welcome to Screenmatch\n" +
		              "1. Register new movie\n" +
		              "2. Register new serie\n" +
		              "9. Exit";
			System.out.println(menu);
			option = keyboard.nextInt();
			keyboard.nextLine();

			
			switch (option) {
			case 1:
				Movie userMovie = Movie.getMovieDetailsFromUser(keyboard);
				userMovie.showTechnicalSheet();
				break;
				
			case 9:
				System.out.println("Leaving the program");
				break;
			default:
				System.out.println("Invalid option");
				break;

			}
		}
	}

}
