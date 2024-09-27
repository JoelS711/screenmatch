package screenmatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Title;
import model.TitleOmdb;

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
		
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);
		System.out.println(titleOmdb);
		
		try{
			Title myTitle = new Title(titleOmdb);
			System.out.println(myTitle);
			
		}catch(NumberFormatException e) {
			System.out.println("Error has ocurred");
			System.out.println(e.getMessage());
		}
		
		System.out.println("The program has finished");
	}

}
