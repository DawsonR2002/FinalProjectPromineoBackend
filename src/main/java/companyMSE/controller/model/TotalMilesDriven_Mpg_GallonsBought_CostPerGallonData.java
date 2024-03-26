package companyMSE.controller.model;

import java.util.HashSet;
import java.util.Set;

import companyMSE.entity.DriverFoodWhereAndWhen;
import companyMSE.entity.TotalMilesDriven_Mpg_GallonsBought_CostPerGallon;

public class TotalMilesDriven_Mpg_GallonsBought_CostPerGallonData {
	private Long totalMilesDriven;
	private  Double mpg;
	private  Long gallonsBought;
	private  Double costPerGallon;

	//in the other table: startingAndEndingMiles, statesDrivenThrough: targeted table - total_miles_driven_mpg_...
    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallonData(TotalMilesDriven_Mpg_GallonsBought_CostPerGallon totalMilesDriven_Mpg_GallonsBought_CostPerGallon){
    	this.totalMilesDriven = totalMilesDriven_Mpg_GallonsBought_CostPerGallon.getTotalMilesDriven();
    	this.mpg = totalMilesDriven_Mpg_GallonsBought_CostPerGallon.getMpg();
    	this.gallonsBought = totalMilesDriven_Mpg_GallonsBought_CostPerGallon.getGallonsBought();
    	this.costPerGallon = totalMilesDriven_Mpg_GallonsBought_CostPerGallon.getCostPerGallon();
    	
    	

    }
}
