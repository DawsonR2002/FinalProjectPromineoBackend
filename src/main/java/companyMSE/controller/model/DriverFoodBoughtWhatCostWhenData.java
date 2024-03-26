package companyMSE.controller.model;

import java.util.Set;

import companyMSE.entity.DriverFoodBoughtWhatCostWhen;

public class DriverFoodBoughtWhatCostWhenData {
    private String whatFoodBought;
    private Double foodBoughtCost;
    private String foodBoughtWhenDate;

    // Constructor
    public DriverFoodBoughtWhatCostWhenData(Set<DriverFoodBoughtWhatCostWhen> set) {
        // Iterate over the set and initialize the attributes
        for (DriverFoodBoughtWhatCostWhen item : set) {
            this.whatFoodBought = item.getWhatFoodBought();
            this.foodBoughtCost = item.getFoodBoughtCost();
            this.foodBoughtWhenDate = item.getFoodBoughtWhenDate();
            // If you only need to handle the first element, you can break the loop here
            //break;
        }
    }
}
//import java.util.Set;
//
//import companyMSE.entity.DriverFoodBoughtWhatCostWhen;
//import companyMSE.entity.DriverFoodWhereAndWhen;
//
//public class DriverFoodBoughtWhatCostWhenData {
//    private String whatFoodBought;
//    private Double foodBoughtCost;
//    private String foodBoughtWhenDate;
//
//    // Constructor
//    public DriverFoodBoughtWhatCostWhenData(Set<DriverFoodBoughtWhatCostWhen> set) {
//    	this.whatFoodBought = ((DriverFoodBoughtWhatCostWhen) set).getWhatFoodBought();
//    	this.foodBoughtCost = ((DriverFoodBoughtWhatCostWhen) set).getFoodBoughtCost();
//    	this.foodBoughtWhenDate = ((DriverFoodBoughtWhatCostWhen) set).getFoodBoughtWhenDate();
//    }
//}