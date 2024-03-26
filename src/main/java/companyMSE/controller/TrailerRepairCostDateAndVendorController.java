package companyMSE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companyMSE.entity.TrailerRepairCostDateAndVendor;

@RestController
@RequestMapping("/api/trailer-repair-cost-date-and-vendor")
public class TrailerRepairCostDateAndVendorController {
	
    
    @Autowired
    private TrailerRepairCostDateAndVendorService service;
    
    @PostMapping("/Trailer")
    public TrailerRepairCostDateAndVendor createStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@RequestBody TrailerRepairCostDateAndVendor data) {
        return service.createTrailerRepairCostDateAndVendor(data);
    }
    
    @GetMapping("/Trailer/{id}")
    public TrailerRepairCostDateAndVendor getStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id) {
        return service.getTrailerRepairCostDateAndVendor(id);
    }
    
    @PutMapping("/Trailer/{id}")
    public TrailerRepairCostDateAndVendor updateStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id, @RequestBody TrailerRepairCostDateAndVendor newData) {
        return service.updateTrailerRepairCostDateAndVendor(id, newData);
    }
    
    @DeleteMapping("/Trailer/{id}")
    public void deleteStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id) {
        service.deleteTrailerRepairCostDateAndVendor(id);
    }
    
}
