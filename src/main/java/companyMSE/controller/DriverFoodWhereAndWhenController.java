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
import companyMSE.entity.DriverFoodWhereAndWhen;

@RestController
@RequestMapping("/api/driver-food-where-and-when")
public class DriverFoodWhereAndWhenController {

	
    @Autowired
    private DriverFoodWhereAndWhenService service;

    @PostMapping("/driverFoodWhereAndWhen")
    public DriverFoodWhereAndWhen createDriverFoodWhereAndWhen(@RequestBody DriverFoodWhereAndWhen data) {
        return service.createDriverFoodWhereAndWhen(data);
    }
    
    @GetMapping("/driverFoodWhereAndWhen/{id}")
    public DriverFoodWhereAndWhen getDriverFoodWhereAndWhen(@PathVariable Long id) {
        return service.getDriverFoodWhereAndWhenById(id);
    }
    
    @PutMapping("/driverFoodWhereAndWhen/{id}")
    public DriverFoodWhereAndWhen updateDriverFoodWhereAndWhen(@PathVariable Long id, @RequestBody DriverFoodWhereAndWhen newData) {
        return service.updateDriverFoodWhereAndWhen(id, newData);
    }
    
    @DeleteMapping("/driverFoodWhereAndWhen/{id}")
    public void deleteDriverFoodWhereAndWhen(@PathVariable Long id) {
        service.deleteDriverFoodWhereAndWhen(id);
    }
    
}
