package companyMSE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companyMSE.controller.model.DriverFoodWhereAndWhenData;
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



public class CompanyMSEController {

    
    @RestController
    @RequestMapping("/api")
    public class CityAndStateOriginAndDestinationController {

        @Autowired
        private CityAndStateOriginAndDestinationService service;

        @PostMapping("/CSOD")
        public CityAndStateOriginAndDestination createCityAndStateOriginAndDestination(@RequestBody CityAndStateOriginAndDestination data) {
            return service.createCityAndStateOriginAndDestination(data);
        }
        
        @GetMapping("/CSOD/{id}")
        public CityAndStateOriginAndDestination getCityAndStateOriginAndDestinationById(@PathVariable Long id) {
            return service.getCityAndStateOriginAndDestinationById(id);
        }
        
        @PutMapping("/CSOD/{id}")
        public CityAndStateOriginAndDestination updateCityAndStateOriginAndDestination(@PathVariable Long id, @RequestBody CityAndStateOriginAndDestination newData) {
            return service.updateCityAndStateOriginAndDestination(id, newData);
        }
        
        @DeleteMapping("/CSOD/{id}")
        public void deleteCityAndStateOriginAndDestination(@PathVariable Long id) {
            service.deleteCityAndStateOriginAndDestination(id);
        }
        
    }
}


//---------------------------------------------------------------------------------------------------------------