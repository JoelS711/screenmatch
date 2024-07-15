package model;

public class Serie extends Title{
	
	private int seasons;
	private int episodesPerSeason;
	private int durationInMinutesPerEpisode;
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
	
	

}
