package companyMSE.controller;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.CityAndStateOriginAndDestinationDao;
import companyMSE.entity.CityAndStateOriginAndDestination;

@Service
public class CityAndStateOriginAndDestinationService {

    @Autowired
    private CityAndStateOriginAndDestinationDao repository;

    public CityAndStateOriginAndDestination createCityAndStateOriginAndDestination(CityAndStateOriginAndDestination data) {
        // Add any additional logic before saving
        return repository.save(data);
    }

    public CityAndStateOriginAndDestination getCityAndStateOriginAndDestinationById(Long id) {
        return repository.findById(id)
                         .orElseThrow();
    }

    public CityAndStateOriginAndDestination updateCityAndStateOriginAndDestination(Long id, CityAndStateOriginAndDestination newData) {
        CityAndStateOriginAndDestination existingData = repository.findById(id)
                                                                 .orElseThrow();
        // Update existing data with new data
        existingData.setCityOrigin(newData.getCityOrigin());
        existingData.setStateOrigin(newData.getStateOrigin());
        existingData.setCityDestination(newData.getCityDestination());
        existingData.setStateDestination(newData.getStateDestination());
        // Add more properties as needed
        
        return repository.save(existingData);
    }

    public void deleteCityAndStateOriginAndDestination(Long id) {
        repository.deleteById(id);
    }
}
