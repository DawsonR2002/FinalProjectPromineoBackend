package companyMSE.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.DriverFoodBoughtWhatCostWhenDao;
import companyMSE.entity.DriverFoodBoughtWhatCostWhen;

@Service
public class DriverFoodBoughtWhatCostWhenService {

    @Autowired
    private DriverFoodBoughtWhatCostWhenDao driverFoodBoughtWhatCostWhenDao;

    // Create operation
    public DriverFoodBoughtWhatCostWhen createDriverFoodBoughtWhatCostWhen(DriverFoodBoughtWhatCostWhen driverFoodBoughtWhatCostWhen) {
        return driverFoodBoughtWhatCostWhenDao.save(driverFoodBoughtWhatCostWhen);
    }

    // Read operations
    public List<DriverFoodBoughtWhatCostWhen> getAllDriverFoodBoughtWhatCostWhen() {
        return driverFoodBoughtWhatCostWhenDao.findAll();
    }

    public DriverFoodBoughtWhatCostWhen getDriverFoodBoughtWhatCostWhenById(Long id) {
        Optional<DriverFoodBoughtWhatCostWhen> optionalDriverFoodBoughtWhatCostWhen = driverFoodBoughtWhatCostWhenDao.findById(id);
        return optionalDriverFoodBoughtWhatCostWhen.orElse(null);
    }

    // Update operation
    public DriverFoodBoughtWhatCostWhen updateDriverFoodBoughtWhatCostWhen(Long id, DriverFoodBoughtWhatCostWhen newData) {
        DriverFoodBoughtWhatCostWhen existingData = getDriverFoodBoughtWhatCostWhenById(id);
        if (existingData != null) {
            // Update existing data with new data
            existingData.setWhatFoodBought(newData.getWhatFoodBought());
            existingData.setFoodBoughtCost(newData.getFoodBoughtCost());
            existingData.setFoodBoughtWhenDate(newData.getFoodBoughtWhenDate());
            // Update other fields as needed
            return driverFoodBoughtWhatCostWhenDao.save(existingData);
        }
        return null;
    }

    // Delete operation
    public void deleteDriverFoodBoughtWhatCostWhen(Long id) {
        driverFoodBoughtWhatCostWhenDao.deleteById(id);
    }

    // Other business logic methods can be added here as needed
}