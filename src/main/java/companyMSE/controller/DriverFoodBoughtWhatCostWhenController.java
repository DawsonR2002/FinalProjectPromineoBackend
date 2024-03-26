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

import companyMSE.entity.DriverFoodBoughtWhatCostWhen;
@RestController
@RequestMapping("/api/driver-food-bought-what-cost-when")
public class DriverFoodBoughtWhatCostWhenController {

    @Autowired
    private DriverFoodBoughtWhatCostWhenService service;
    //driverFoodBoughtWhatCostWhen
    @PostMapping("/foodRecieptsWhat")
    public DriverFoodBoughtWhatCostWhen createDriverFoodBoughtWhatCostWhen(@RequestBody DriverFoodBoughtWhatCostWhen data) {
        return service.createDriverFoodBoughtWhatCostWhen(data);
    }
    
    @GetMapping("/foodRecieptsWhat/{id}")
    public DriverFoodBoughtWhatCostWhen getDriverFoodBoughtWhatCostWhen(@PathVariable Long id) {
        return service.getDriverFoodBoughtWhatCostWhenById(id);
    }
    
    @PutMapping("/foodRecieptsWhat/{id}")
    public DriverFoodBoughtWhatCostWhen updateDriverFoodBoughtWhatCostWhen(@PathVariable Long id, @RequestBody DriverFoodBoughtWhatCostWhen newData) {
        return service.updateDriverFoodBoughtWhatCostWhen(id, newData);
    }
    
    @DeleteMapping("/foodRecieptsWhat/{id}")
    public void deleteDriverFoodBoughtWhatCostWhen(@PathVariable Long id) {
        service.deleteDriverFoodBoughtWhatCostWhen(id);
    }
    
}
