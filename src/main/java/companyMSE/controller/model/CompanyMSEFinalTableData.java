package companyMSE.controller.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;

import companyMSE.entity.CityAndStateOriginAndDestination;
import companyMSE.entity.CompanyMSEFinalTable;
import companyMSE.entity.DriverFoodBoughtWhatCostWhen;
import companyMSE.entity.DriverFoodWhereAndWhen;
import companyMSE.entity.StartingAndEndingMilesPerDay;
import companyMSE.entity.StatesDrivenThrough_MilesInStates_MilesDrivenPerDay;
import companyMSE.entity.TotalMilesDriven_Mpg_GallonsBought_CostPerGallon;
import companyMSE.entity.TrailerRepairCostDateAndVendor;
import companyMSE.entity.TruckMiscCostDateAndVendor;
import companyMSE.entity.TruckRepairCostDateAndVendor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyMSEFinalTableData {
//	CompanyMSEFinalTable finalTableClassRef = new CompanyMSEFinalTable();
	@Id
	public Long companyMSEFinalTableDataId;


	 private Set<CityAndStateOriginAndDestinationData> cityAndStateOriginAndDestinationData = new HashSet<>();
	 private Set<DriverFoodBoughtWhatCostWhenData> driverFoodBoughtWhatCostWhenData = new HashSet<>();
	 private Set<DriverFoodWhereAndWhenData> driverFoodWhereAndWhenData = new HashSet<>();
	 private Set<StartingAndEndingMilesPerDayData> startingAndEndingMilesPerDayData = new HashSet<>();
	 private Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDayData> statesDrivenThrough_MilesInStates_MilesDrivenPerDayData = new HashSet<>();
	 private Set<TotalMilesDriven_Mpg_GallonsBought_CostPerGallonData> totalMilesDriven_Mpg_GallonsBought_CostPerGallonData = new HashSet<>();
	 private Set<TrailerRepairCostDateAndVendorData> trailerRepairCostDateAndVendorData = new HashSet<>();
	 private Set<TruckMiscCostDateAndVendorData> truckMiscCostDateAndVendorData = new HashSet<>();
	 private Set<TruckRepairCostDateAndVendorData> truckRepairCostDateAndVendorData = new HashSet<>();
	    
	    // Other fields representing related entities
	    
	    // Constructors

	    // Constructor to initialize from entity
	    public CompanyMSEFinalTableData(CompanyMSEFinalTable companyMSEFinalTable) {
	        // Populate fields from entity
	        this.companyMSEFinalTableDataId = companyMSEFinalTable.getId();
	        
	        
	        // Initialize sets
	        this.cityAndStateOriginAndDestinationData = new HashSet<>();
	        this.driverFoodBoughtWhatCostWhenData = new HashSet<>();
	        this.driverFoodWhereAndWhenData = new HashSet<>();
	        this.startingAndEndingMilesPerDayData = new HashSet<>();
	        this.statesDrivenThrough_MilesInStates_MilesDrivenPerDayData = new HashSet<>();
	        this.totalMilesDriven_Mpg_GallonsBought_CostPerGallonData = new HashSet<>();
	        this.trailerRepairCostDateAndVendorData = new HashSet<>();
	        this.truckMiscCostDateAndVendorData = new HashSet<>();
	        this.truckRepairCostDateAndVendorData = new HashSet<>();
	        
	        // Initialize other sets
	        
	        // Populate sets from entity
	        populateCityAndStateOriginAndDestinationData(companyMSEFinalTable.getOriginAndDestination());
	        populateDriverFoodBoughtWhatCostWhenData(companyMSEFinalTable.getFoodBoughtWhatCostWhen());
	        populateDriverFoodWhereAndWhenData(companyMSEFinalTable.getFoodBoughtWhereAndWhen());
	        populateTrailerRepairCostDateAndVendorData(companyMSEFinalTable.getTrailerRepairs());
	        populateTruckMiscCostDateAndVendorData(companyMSEFinalTable.getTruckMiscCosts());
	        populateTruckRepairCostDateAndVendorData(companyMSEFinalTable.getTruckRepairs());
	        populateStartingAndEndingMilesPerDayData(companyMSEFinalTable.getFuelQuarterlyConnection());
	        populateStatesDrivenThrough_MilesInStates_MilesDrivenPerDayData(companyMSEFinalTable.getStatesDrivenThroughSet());
	        populateTotalMilesDriven_Mpg_GallonsBought_CostPerGallonData(companyMSEFinalTable.getTMD_MPG_GB_CPG());
	        // Populate other sets
	    }
	    
	   

		// Setters and other methods
	    
	    private void populateTotalMilesDriven_Mpg_GallonsBought_CostPerGallonData(
				TotalMilesDriven_Mpg_GallonsBought_CostPerGallon tmd_MPG_GB_CPG) {
			// TODO Auto-generated method stub
	    	if (tmd_MPG_GB_CPG != null) {
	            this.totalMilesDriven_Mpg_GallonsBought_CostPerGallonData.add(new TotalMilesDriven_Mpg_GallonsBought_CostPerGallonData(tmd_MPG_GB_CPG));
	        }
		}



		private void populateStatesDrivenThrough_MilesInStates_MilesDrivenPerDayData(
				Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> statesDrivenThroughSet) {
	    	if (statesDrivenThroughSet != null) {
	            this.statesDrivenThrough_MilesInStates_MilesDrivenPerDayData.add(new StatesDrivenThrough_MilesInStates_MilesDrivenPerDayData(statesDrivenThroughSet));
	        }
			// TODO Auto-generated method stub
			
		}

		private void populateStartingAndEndingMilesPerDayData(StartingAndEndingMilesPerDay fuelQuarterlyConnection) {
	    	if (fuelQuarterlyConnection != null) {
	            this.startingAndEndingMilesPerDayData.add(new StartingAndEndingMilesPerDayData(fuelQuarterlyConnection));
	        }
		}

		// Method to populate CityAndStateOriginAndDestinationData set
	    private void populateCityAndStateOriginAndDestinationData(CityAndStateOriginAndDestination cityAndStateOriginAndDestination) {
	        if (cityAndStateOriginAndDestination != null) {
	            this.cityAndStateOriginAndDestinationData.add(new CityAndStateOriginAndDestinationData(cityAndStateOriginAndDestination));
	        }
	    }
	    
	    // Method to populate DriverFoodBoughtWhatCostWhenData set
	    private void populateDriverFoodBoughtWhatCostWhenData(Set<DriverFoodBoughtWhatCostWhen> set) {
	        if (set != null) {
	            this.driverFoodBoughtWhatCostWhenData.add(new DriverFoodBoughtWhatCostWhenData(set));
	        }
	    }
	    
	    private void populateDriverFoodWhereAndWhenData(DriverFoodWhereAndWhen driverFoodWhereAndWhen) {
	        if (driverFoodWhereAndWhen != null) {
	            this.driverFoodWhereAndWhenData.add(new DriverFoodWhereAndWhenData(driverFoodWhereAndWhen));
	        }
	    }
	    
	    private void populateTrailerRepairCostDateAndVendorData(TrailerRepairCostDateAndVendor trailerRepairCostDateAndVendor) {
	        if (trailerRepairCostDateAndVendor != null) {
	            this.trailerRepairCostDateAndVendorData.add(new TrailerRepairCostDateAndVendorData(trailerRepairCostDateAndVendor));
	        }
	    }
	    
	    private void populateTruckMiscCostDateAndVendorData(Set<TruckMiscCostDateAndVendor> set) {
	        if (set != null) {
	            this.truckMiscCostDateAndVendorData.add(new TruckMiscCostDateAndVendorData(set));
	        }
	    }
	    
	    private void populateTruckRepairCostDateAndVendorData(TruckRepairCostDateAndVendor trailerRepairCostDateAndVendor) {
	        if (trailerRepairCostDateAndVendor != null) {
	            this.truckRepairCostDateAndVendorData.add(new TruckRepairCostDateAndVendorData(trailerRepairCostDateAndVendor));
	        }
	    }
	    

	

}
