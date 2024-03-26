package companyMSE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.TrailerRepairCostDateAndVendorDao;
import companyMSE.entity.TrailerRepairCostDateAndVendor;

@Service
public class TrailerRepairCostDateAndVendorService {

    private final TrailerRepairCostDateAndVendorDao trailerRepairDao;

    @Autowired
    public TrailerRepairCostDateAndVendorService(TrailerRepairCostDateAndVendorDao trailerRepairDao) {
        this.trailerRepairDao = trailerRepairDao;
    }

    public TrailerRepairCostDateAndVendor createTrailerRepairCostDateAndVendor(TrailerRepairCostDateAndVendor data) {
        // Implement logic to create a new TrailerRepairCostDateAndVendor entity
        return trailerRepairDao.save(data);
    }

    public TrailerRepairCostDateAndVendor getTrailerRepairCostDateAndVendor(Long id) {
        // Implement logic to retrieve a TrailerRepairCostDateAndVendor entity by ID
        return trailerRepairDao.findById(id).orElse(null);
    }

    public TrailerRepairCostDateAndVendor updateTrailerRepairCostDateAndVendor(Long id, TrailerRepairCostDateAndVendor newData) {
        // Implement logic to update an existing TrailerRepairCostDateAndVendor entity
        if (trailerRepairDao.existsById(id)) {
            newData.setId(id);
            return trailerRepairDao.save(newData);
        }
        return null;
    }

    public void deleteTrailerRepairCostDateAndVendor(Long id) {
        // Implement logic to delete a TrailerRepairCostDateAndVendor entity by ID
        trailerRepairDao.deleteById(id);
    }
}
