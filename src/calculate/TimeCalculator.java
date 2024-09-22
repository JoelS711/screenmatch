package calculate;

import model.Title;

public class TimeCalculator {

	private int totalTime;

	public int getTotalTime() {
		return this.totalTime;
	}

	public void include(Title title) {
		System.out.println("Adding duration in minutes");
		this.totalTime += title.getDurationTime();
	}
}
