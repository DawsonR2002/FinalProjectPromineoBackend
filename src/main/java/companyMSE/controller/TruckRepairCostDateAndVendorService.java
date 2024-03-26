package companyMSE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.TruckRepairCostDateAndVendorDao;
import companyMSE.entity.TruckRepairCostDateAndVendor;

@Service
public class TruckRepairCostDateAndVendorService {

	@Autowired
    private TruckRepairCostDateAndVendorDao repairCostDateAndVendorDao;

   
    

    public TruckRepairCostDateAndVendor createTruckRepairCostDateAndVendor(TruckRepairCostDateAndVendor data) {
        // Implement logic to create a new TruckRepairCostDateAndVendor entity
        return repairCostDateAndVendorDao.save(data);
    }

    public TruckRepairCostDateAndVendor getTruckRepairCostDateAndVendor(Long id) {
        // Implement logic to retrieve a TruckRepairCostDateAndVendor entity by ID
        return repairCostDateAndVendorDao.findById(id).orElse(null);
    }

    public TruckRepairCostDateAndVendor updateTruckRepairCostDateAndVendor(Long id, TruckRepairCostDateAndVendor newData) {
        // Implement logic to update an existing TruckRepairCostDateAndVendor entity
        return repairCostDateAndVendorDao.save(newData);
    }

    public void deleteTruckRepairCostDateAndVendor(Long id) {
        // Implement logic to delete a TruckRepairCostDateAndVendor entity by ID
    	repairCostDateAndVendorDao.deleteById(id);
    }
}
