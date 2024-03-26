package companyMSE.controller.model;

import java.util.Set;

import companyMSE.entity.StatesDrivenThrough_MilesInStates_MilesDrivenPerDay;

public class StatesDrivenThrough_MilesInStates_MilesDrivenPerDayData {
    private String statesDrivenThrough;
    private Long milesInStates;
    private Long milesDrivenPerDay;

    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDayData(Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> statesDrivenThroughSet) {
        // Iterate over the set and initialize the attributes
        for (StatesDrivenThrough_MilesInStates_MilesDrivenPerDay item : statesDrivenThroughSet) {
            this.statesDrivenThrough = item.getStatesDrivenThrough();
            this.milesInStates = item.getMilesInStates();
            this.milesDrivenPerDay = item.getMilesDrivenPerDay();
            // If you only need to handle the first element, you can break the loop here
            //break;
        }
    }
}
//
//import java.util.Set;
//
//import companyMSE.entity.StartingAndEndingMilesPerDay;
//import companyMSE.entity.StatesDrivenThrough_MilesInStates_MilesDrivenPerDay;
//
//public class StatesDrivenThrough_MilesInStates_MilesDrivenPerDayData {
//    private String statesDrivenThrough;
//    private Long milesInStates;
//    private Long milesDrivenPerDay;
//
//
//
//
//    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDayData(Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> statesDrivenThroughSet){
//    	this.statesDrivenThrough = ((StatesDrivenThrough_MilesInStates_MilesDrivenPerDay) statesDrivenThroughSet).getStatesDrivenThrough();
//    	this.milesInStates = ((StatesDrivenThrough_MilesInStates_MilesDrivenPerDay) statesDrivenThroughSet).getMilesInStates();
//    	this.milesDrivenPerDay = ((StatesDrivenThrough_MilesInStates_MilesDrivenPerDay) statesDrivenThroughSet).getMilesDrivenPerDay();
//
//    }
//}
