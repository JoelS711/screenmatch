package screenmatch;


import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import exception.DurationConversionErrorException;
import model.Title;
import model.TitleOmdb;

public class MainWithSearch {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		
		List<Title> titles = new ArrayList<>();
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
		
		while(true) {
			System.out.println("Enter de name of the movie: ");
			var nameMovie = keyboard.nextLine();
			
			if(nameMovie.equalsIgnoreCase("salir")) {
				break;
			}
			String encodedMovieName = URLEncoder.encode(nameMovie, "UTF-8");
			String url = "http://www.omdbapi.com/?t=" + encodedMovieName + "&apikey=9f0dabfa";
			try {
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				
				String json = response.body();
				System.out.println(json);
				
				TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);
				System.out.println(titleOmdb);
				
				Title myTitle = new Title(titleOmdb);
				System.out.println("Title converted "+myTitle);
				
				titles.add(myTitle);
			} catch (NumberFormatException e) {
				System.out.println("Error has ocurred");
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("URI error, check your address");
			} catch (DurationConversionErrorException e) {
				System.out.println(e.getMessage());
			}
			
		}

		System.out.println(titles);
		FileWriter writing= new FileWriter("titles.json");
		writing.write(gson.toJson(titles));
		writing.close();
		System.out.println("The program has finished");
		keyboard.close();
	}

}
