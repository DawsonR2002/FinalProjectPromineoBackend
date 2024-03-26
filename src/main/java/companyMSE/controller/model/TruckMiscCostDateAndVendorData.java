package companyMSE.controller.model;

import java.util.Set;

import companyMSE.entity.TruckMiscCostDateAndVendor;

public class TruckMiscCostDateAndVendorData {
    private String truckMiscVendor;
    private String truckMiscDate;
    private Double truckMiscCost;

    public TruckMiscCostDateAndVendorData(Set<TruckMiscCostDateAndVendor> set) {
        // Iterate over the set and initialize the attributes
        for (TruckMiscCostDateAndVendor item : set) {
            this.truckMiscVendor = item.getTruckMiscVendor();
            this.truckMiscDate = item.getTruckMiscDate();
            this.truckMiscCost = item.getTruckMiscCost();
            // If you only need to handle the first element, you can break the loop here
            //break;
        }
    }
}

//package companyMSE.controller.model;
//
//import java.util.Set;
//
//import companyMSE.entity.TruckMiscCostDateAndVendor;
//
//public class TruckMiscCostDateAndVendorData {
//    private String truckMiscVendor;
//    private String truckMiscDate;
//    private Double truckMiscCost;
//
//
//
//
//
//    public TruckMiscCostDateAndVendorData(Set<TruckMiscCostDateAndVendor> set){
//    	this.truckMiscVendor = ((TruckMiscCostDateAndVendor) set).getTruckMiscVendor();
//    	this.truckMiscDate = ((TruckMiscCostDateAndVendor) set).getTruckMiscDate();
//    	this.truckMiscCost = ((TruckMiscCostDateAndVendor) set).getTruckMiscCost();
//
//    }
//
//}
