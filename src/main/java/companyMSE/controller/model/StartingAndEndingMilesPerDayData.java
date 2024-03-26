package companyMSE.controller.model;

import companyMSE.entity.DriverFoodWhereAndWhen;
import companyMSE.entity.StartingAndEndingMilesPerDay;

public class StartingAndEndingMilesPerDayData {
	private Long startingMiles;
    private Long endingMiles;




    public StartingAndEndingMilesPerDayData(StartingAndEndingMilesPerDay startingAndEndingMilesPerDay){
    	this.startingMiles = startingAndEndingMilesPerDay.getStartingMiles();
    	this.endingMiles = startingAndEndingMilesPerDay.getEndingMiles();

    }

}
