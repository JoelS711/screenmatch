package screenmatch;

import java.util.Scanner;

import model.Movie;

public class Principal {

	public void showTheMenu() {
		int option = 0;
		Scanner keyboard = new Scanner(System.in);
		while (option != 9) {
			String menu = """
					Welcome to Screenmatch
					1. Register new movie
					2. Register new serie
					9. Exit
					""";
			System.out.println(menu);
			option = keyboard.nextInt();
			keyboard.nextLine();

			switch (option) {
			case 1:
				System.out.println("Enter the name of the movie: ");
				String name = keyboard.nextLine();
				System.out.println("Enter the relase date: ");
				int relaseDate = keyboard.nextInt();
				keyboard.nextLine();
				System.out.println("Enter the length of the movie in minutes: ");
				int durationTime = keyboard.nextInt();
				keyboard.nextLine();

				Movie userMovie = new Movie();
				userMovie.setName(name);
				userMovie.setRelaseDate(relaseDate);
				userMovie.setDurationTime(durationTime);
				userMovie.showTechnicalSheet();
				break;
				
			case 9:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Invalid option");
				break;

			}
		}
	}

}
