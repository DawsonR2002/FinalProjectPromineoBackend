package companyMSE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.TotalMilesDriven_Mpg_GallonsBought_CostPerGallonDao;
import companyMSE.entity.TotalMilesDriven_Mpg_GallonsBought_CostPerGallon;

@Service
public class TotalMilesDriven_Mpg_GallonsBought_CostPerGallonService {

    private final TotalMilesDriven_Mpg_GallonsBought_CostPerGallonDao repository;

    @Autowired
    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallonService(TotalMilesDriven_Mpg_GallonsBought_CostPerGallonDao repository) {
        this.repository = repository;
    }

    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallon createTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(TotalMilesDriven_Mpg_GallonsBought_CostPerGallon data) {
        // Implementation to create and save the data
        return repository.save(data);
    }

    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallon getTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(Long id) {
        // Implementation to retrieve data by ID
        return repository.findById(id).orElse(null);
    }

    public TotalMilesDriven_Mpg_GallonsBought_CostPerGallon updateTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(Long id, TotalMilesDriven_Mpg_GallonsBought_CostPerGallon newData) {
        // Implementation to update existing data
        TotalMilesDriven_Mpg_GallonsBought_CostPerGallon existingData = repository.findById(id).orElse(null);
        if (existingData != null) {
            // Update the fields of existingData with newData
            // Save the updated data
            return repository.save(existingData);
        }
        return null; // Or throw an exception if data with the given ID is not found
    }

    public void deleteTotalMilesDriven_Mpg_GallonsBought_CostPerGallon(Long id) {
        // Implementation to delete data by ID
        repository.deleteById(id);
    }
}