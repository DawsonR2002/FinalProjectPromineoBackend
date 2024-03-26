package companyMSE.controller.model;

import companyMSE.entity.TruckMiscCostDateAndVendor;
import companyMSE.entity.TruckRepairCostDateAndVendor;

public class TruckRepairCostDateAndVendorData {
    private String truckRepairVendor;
    private String truckRepairDate;
    private Double truckRepairCost;





    public TruckRepairCostDateAndVendorData(TruckRepairCostDateAndVendor truckRepairCostDateAndVendor){
    	this.truckRepairVendor = truckRepairCostDateAndVendor.getTruckRepairVendor();
    	this.truckRepairDate = truckRepairCostDateAndVendor.getTruckRepairDate();
    	this.truckRepairCost = truckRepairCostDateAndVendor.getTruckRepairCost();

    }
}
