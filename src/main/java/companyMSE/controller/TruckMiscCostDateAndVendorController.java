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

import companyMSE.entity.TruckMiscCostDateAndVendor;

@RestController
@RequestMapping("/api/truck-misc-cost-date-and-vendor")
public class TruckMiscCostDateAndVendorController {

	
    @Autowired
    private TruckMiscCostDateAndVendorService service;

    @PostMapping("/Misc")
    public TruckMiscCostDateAndVendor createTruckMiscCostDateAndVendor(@RequestBody TruckMiscCostDateAndVendor data) {
        return service.createTruckMiscCostDateAndVendor(data);
    }
    
    @GetMapping("/Misc/{id}")
    public TruckMiscCostDateAndVendor getTruckMiscCostDateAndVendor(@PathVariable Long id) {
        return service.getTruckMiscCostDateAndVendor(id);
    }
    
    @PutMapping("/Misc/{id}")
    public TruckMiscCostDateAndVendor updateTruckMiscCostDateAndVendor(@PathVariable Long id, @RequestBody TruckMiscCostDateAndVendor newData) {
        return service.updateTruckMiscCostDateAndVendor(id, newData);
    }
    
    @DeleteMapping("/Misc/{id}")
    public void deleteTruckMiscCostDateAndVendor(@PathVariable Long id) {
        service.deleteTruckMiscCostDateAndVendor(id);
    }
    
}