package companyMSE.controller.model;

import companyMSE.entity.DriverFoodBoughtWhatCostWhen;
import companyMSE.entity.DriverFoodWhereAndWhen;

public class DriverFoodWhereAndWhenData {
    private String foodBoughtWhere;
    private String foodBoughtWhenDate;




    public DriverFoodWhereAndWhenData(DriverFoodWhereAndWhen driverFoodWhereAndWhen){
    	this.foodBoughtWhere = driverFoodWhereAndWhen.getFoodBoughtWhere();
    	this.foodBoughtWhenDate = driverFoodWhereAndWhen.getFoodBoughtWhenDate();

    }
}
