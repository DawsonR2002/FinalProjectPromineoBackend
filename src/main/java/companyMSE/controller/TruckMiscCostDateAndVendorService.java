package companyMSE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.TruckMiscCostDateAndVendorDao;
import companyMSE.entity.TruckMiscCostDateAndVendor;

@Service
public class TruckMiscCostDateAndVendorService {

    private final TruckMiscCostDateAndVendorDao truckMiscCostDateAndVendorRepository;

    @Autowired
    public TruckMiscCostDateAndVendorService(TruckMiscCostDateAndVendorDao truckMiscCostDateAndVendorRepository) {
        this.truckMiscCostDateAndVendorRepository = truckMiscCostDateAndVendorRepository;
    }

    public TruckMiscCostDateAndVendor createTruckMiscCostDateAndVendor(TruckMiscCostDateAndVendor data) {
        // Add logic to create a new TruckMiscCostDateAndVendor
        return truckMiscCostDateAndVendorRepository.save(data);
    }

    public TruckMiscCostDateAndVendor getTruckMiscCostDateAndVendor(Long id) {
        // Add logic to retrieve TruckMiscCostDateAndVendor by id
        return truckMiscCostDateAndVendorRepository.findById(id).orElse(null);
    }

    public TruckMiscCostDateAndVendor updateTruckMiscCostDateAndVendor(Long id, TruckMiscCostDateAndVendor newData) {
        // Add logic to update TruckMiscCostDateAndVendor
        TruckMiscCostDateAndVendor existingData = truckMiscCostDateAndVendorRepository.findById(id).orElse(null);
        if (existingData != null) {
            // Update the fields of existingData with newData
            existingData.setTruckMiscVendor(newData.getTruckMiscVendor());
            existingData.setTruckMiscDate(newData.getTruckMiscDate());
            existingData.setTruckMiscCost(newData.getTruckMiscCost());
            return truckMiscCostDateAndVendorRepository.save(existingData);
        } else {
            return null; // or throw an exception indicating that the entity with the given id does not exist
        }
    }

    public void deleteTruckMiscCostDateAndVendor(Long id) {
        // Add logic to delete TruckMiscCostDateAndVendor
        truckMiscCostDateAndVendorRepository.deleteById(id);
    }
}
