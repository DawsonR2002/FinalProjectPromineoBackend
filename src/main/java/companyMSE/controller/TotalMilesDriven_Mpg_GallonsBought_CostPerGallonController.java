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

import companyMSE.entity.TotalMilesDriven_Mpg_GallonsBought_CostPerGallon;

@RestController
@RequestMapping("/api/total-miles-driven-mpg-gallons-bought-cost-per-gallon")
public class TotalMilesDriven_Mpg_GallonsBought_CostPerGallonController {

	
    
    @Autowired
    private TotalMilesDriven_Mpg_GallonsBought_CostPerGallonService service;

    @PostMapping("/TotalMilesDrivenMPG")
    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallon createTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(@RequestBody TotalMilesDriven_Mpg_GallonsBought_CostPerGallon data) {
        return service.createTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(data);
    }
    
    @GetMapping("/TotalMilesDrivenMPG/{id}")
    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallon getStatesTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(@PathVariable Long id) {
        return service.getTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(id);
    }
    
    @PutMapping("/TotalMilesDrivenMPG/{id}")
    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallon updateTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(@PathVariable Long id, @RequestBody TotalMilesDriven_Mpg_GallonsBought_CostPerGallon newData) {
        return service.updateTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(id, newData);
    }
    
    @DeleteMapping("/TotalMilesDrivenMPG/{id}")
    public void deleteStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id) {
        service.deleteTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(id);
    }
    
}
