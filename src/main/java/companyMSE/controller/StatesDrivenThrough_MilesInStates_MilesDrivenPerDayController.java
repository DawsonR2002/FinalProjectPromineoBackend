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

import companyMSE.entity.StatesDrivenThrough_MilesInStates_MilesDrivenPerDay;

@RestController
@RequestMapping("/api/states-driven-through-miles-in-states-miles-driven-per-day")
public class StatesDrivenThrough_MilesInStates_MilesDrivenPerDayController {

	
    @Autowired
    private StatesDrivenThrough_MilesInStates_MilesDrivenPerDayService service;

    @PostMapping("/StatesDrivenThrough")
    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDay createStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@RequestBody StatesDrivenThrough_MilesInStates_MilesDrivenPerDay data) {
        return service.createStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(data);
    }
    
    @GetMapping("/StatesDrivenThrough/{id}")
    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDay getStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id) {
        return service.getStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(id);
    }
    
    @PutMapping("/StatesDrivenThrough/{id}")
    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDay updateStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id, @RequestBody StatesDrivenThrough_MilesInStates_MilesDrivenPerDay newData) {
        return service.updateStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(id, newData);
    }
    
    @DeleteMapping("/StatesDrivenThrough/{id}")
    public void deleteStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(@PathVariable Long id) {
        service.deleteStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(id);
    }
    
}
