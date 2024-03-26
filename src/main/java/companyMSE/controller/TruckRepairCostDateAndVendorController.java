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

import companyMSE.entity.TruckRepairCostDateAndVendor;

@RestController
@RequestMapping("/api/truck-repair-cost-date-and-vendor")
public class TruckRepairCostDateAndVendorController {

	
    @Autowired
    private TruckRepairCostDateAndVendorService service;

    @PostMapping("/TruckRepair")
    public TruckRepairCostDateAndVendor createTruckRepairCostDateAndVendor(@RequestBody TruckRepairCostDateAndVendor data) {
        return service.createTruckRepairCostDateAndVendor(data);
    }
    
    @GetMapping("/TruckRepair/{id}")
    public TruckRepairCostDateAndVendor getTruckRepairCostDateAndVendor(@PathVariable Long id) {
        return service.getTruckRepairCostDateAndVendor(id);
    }
    
    @PutMapping("/TruckRepair/{id}")
    public TruckRepairCostDateAndVendor updateTruckRepairCostDateAndVendor(@PathVariable Long id, @RequestBody TruckRepairCostDateAndVendor newData) {
        return service.updateTruckRepairCostDateAndVendor(id, newData);
    }
    
    @DeleteMapping("/TruckRepair/{id}")
    public void deleteTruckRepairCostDateAndVendor(@PathVariable Long id) {
        service.deleteTruckRepairCostDateAndVendor(id);
    }
    
}