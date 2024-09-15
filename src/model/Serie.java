package model;

import java.util.Scanner;

public class Serie extends Title{
	
	private int seasons;
	private int episodesPerSeason;
	private int durationInMinutesPerEpisode;
	
	@Override
	public int getDurationTime() {
		return durationInMinutesPerEpisode * episodesPerSeason * seasons;
	}
	
	
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public int getEpisodesPerSeason() {
		return episodesPerSeason;
	}
	public void setEpisodesPerSeason(int episodesPerSeason) {
		this.episodesPerSeason = episodesPerSeason;
	}
	public int getDurationInMinutesPerEpisode() {
		return durationInMinutesPerEpisode;
	}
	public void setDurationInMinutesPerEpisode(int durationInMinutesPerEpisode) {
		this.durationInMinutesPerEpisode = durationInMinutesPerEpisode;
	}
	
	
	public static Serie getSerieDetailsFromUser(Scanner keyboard) {
        System.out.println("Enter the name of the serie: ");
        String _name = keyboard.nextLine();
        
        System.out.println("Enter the release date: ");
        int _releaseDate = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter the number of the seasons: ");
        int _seasons = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter the episodes per season: ");
        int _episodesPerSeason = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter the duration in minutes per episode: ");
        int _durationInMinutesPerEpisode = keyboard.nextInt();
        keyboard.nextLine();
        
  
        
        Serie userSerie = new Serie();
        userSerie.setName(_name);
        userSerie.setRelaseDate(_releaseDate);
        userSerie.setSeasons(_seasons);
        userSerie.setEpisodesPerSeason(_episodesPerSeason);
        userSerie.setDurationInMinutesPerEpisode(_durationInMinutesPerEpisode);
        return userSerie;
    }
	
	@Override
	public void showTechnicalSheet() {
		super.showTechnicalSheet();
		System.out.println("Number of seasons: " + this.getSeasons());
		System.out.println("Number of episode per seasons: " + this.getEpisodesPerSeason());
		System.out.println("Duration in minutes per episode: " + this.getDurationInMinutesPerEpisode());
	}

}
