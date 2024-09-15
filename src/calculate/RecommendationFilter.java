package calculate;

public class RecommendationFilter {

	public void filter(Classifiable classifiable) {
		if(classifiable.getClassifiable() >= 4) {
			System.out.println("Very well evaluated by platform users");
		}else if(classifiable.getClassifiable() >= 2) {
			System.out.println("Popular at the time");
		}else {
			System.out.println("Put it on your list to see them later");
		}
	}
}
