package companyMSE.controller.model;

import companyMSE.entity.TrailerRepairCostDateAndVendor;

public class TrailerRepairCostDateAndVendorData {
    private String trailerRepairVendor;
    private String trailerRepairDate;
    private Double trailerRepairCost;





    public TrailerRepairCostDateAndVendorData(TrailerRepairCostDateAndVendor trailerRepairCostDateAndVendor){
    	this.trailerRepairVendor = trailerRepairCostDateAndVendor.getTrailerRepairVendor();
    	this.trailerRepairDate = trailerRepairCostDateAndVendor.getTrailerRepairDate();
    	this.trailerRepairCost = trailerRepairCostDateAndVendor.getTrailerRepairCost();

    }
}
