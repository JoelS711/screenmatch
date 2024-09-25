package screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

import model.Title;

public class MainWithSearch {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter de name of the movie: ");
		var nameMovie = keyboard.nextLine();
		
		String url = "http://www.omdbapi.com/?t="+nameMovie+"&apikey=9f0dabfa";
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String json = response.body();
		System.out.println(json);
		
		Gson gson = new Gson();
		Title myTitle = gson.fromJson(json, Title.class);
		System.out.println(myTitle);
	}

}
