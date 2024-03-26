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

import companyMSE.entity.StartingAndEndingMilesPerDay;

@RestController
@RequestMapping("/api/starting-and-ending-miles-per-day")
public class StartingAndEndingMilesPerDayController {

	
    @Autowired
    private StartingAndEndingMilesPerDayService service;

    @PostMapping("/DailyStartingAndEndingMiles")
    public StartingAndEndingMilesPerDay createStartingAndEndingMilesPerDay(@RequestBody StartingAndEndingMilesPerDay data) {
        return service.createStartingAndEndingMilesPerDay(data);
    }
    
    @GetMapping("/DailyStartingAndEndingMiles/{id}")
    public StartingAndEndingMilesPerDay getStartingAndEndingMilesPerDay(@PathVariable Long id) {
        return service.getStartingAndEndingMilesPerDayById(id);
    }
    
    @PutMapping("/DailyStartingAndEndingMiles/{id}")
    public StartingAndEndingMilesPerDay updateStartingAndEndingMilesPerDay(@PathVariable Long id, @RequestBody StartingAndEndingMilesPerDay newData) {
        return service.updateStartingAndEndingMilesPerDay(id, newData);
    }
    
    @DeleteMapping("/DailyStartingAndEndingMiles/{id}")
    public void deleteStartingAndEndingMilesPerDay(@PathVariable Long id) {
        service.deleteStartingAndEndingMilesPerDay(id);
    }
    
}
