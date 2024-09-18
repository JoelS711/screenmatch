package model;

import java.util.Scanner;

public class Documental extends Title{

	public Documental(String name, int releaseDate) {
		super(name, releaseDate);
	}

	private String distributedBy;

	public String getDistributedBy() {
		return distributedBy;
	}

	public void setDistributedBy(String distributedBy) {
		this.distributedBy = distributedBy;
	}
	
	public static Documental getDocumentalDetailsFromUser(Scanner keyboard) {
        System.out.println("Enter the name of the documental: ");
        String _name = keyboard.nextLine();
        
        System.out.println("Enter the release date: ");
        int _releaseDate = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter the length of the documental in minutes: ");
        int _durationTime = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter dealer name: ");
        String _distributedBy = keyboard.nextLine();
        keyboard.nextLine();
        
        Documental userDocumental = new Documental(_name, _releaseDate);
        userDocumental.setName(_name);
        userDocumental.setReleaseDate(_releaseDate);
        userDocumental.setDurationTime(_durationTime);
        userDocumental.setDistributedBy(_distributedBy);
        
        return userDocumental;
    }
	
	@Override
	public void showTechnicalSheet() {
		super.showTechnicalSheet();
		System.out.println("Distributed By: " + this.getDistributedBy());
	}
}
