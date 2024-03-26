package companyMSE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.DriverFoodWhereAndWhenDao;
import companyMSE.entity.DriverFoodWhereAndWhen;

@Service
public class DriverFoodWhereAndWhenService {

    private final DriverFoodWhereAndWhenDao driverFoodWhereAndWhenDao;

    @Autowired
    public DriverFoodWhereAndWhenService(DriverFoodWhereAndWhenDao driverFoodWhereAndWhenDao) {
        this.driverFoodWhereAndWhenDao = driverFoodWhereAndWhenDao;
    }

    public List<DriverFoodWhereAndWhen> getAllDriverFoodWhereAndWhen() {
        return driverFoodWhereAndWhenDao.findAll();
    }

    public DriverFoodWhereAndWhen getDriverFoodWhereAndWhenById(Long id) {
        return driverFoodWhereAndWhenDao.findById(id)
                .orElseThrow();
    }

    public DriverFoodWhereAndWhen createDriverFoodWhereAndWhen(DriverFoodWhereAndWhen driverFoodWhereAndWhen) {
        return driverFoodWhereAndWhenDao.save(driverFoodWhereAndWhen);
    }

    public DriverFoodWhereAndWhen updateDriverFoodWhereAndWhen(Long id, DriverFoodWhereAndWhen driverFoodWhereAndWhen) {
        DriverFoodWhereAndWhen existingDriverFoodWhereAndWhen = getDriverFoodWhereAndWhenById(id);
        // Update existing entity with new data
        existingDriverFoodWhereAndWhen.setFoodBoughtWhere(driverFoodWhereAndWhen.getFoodBoughtWhere());
        existingDriverFoodWhereAndWhen.setFoodBoughtWhereAndWhen(driverFoodWhereAndWhen.getFoodBoughtWhereAndWhen());
        existingDriverFoodWhereAndWhen.setFoodBoughtWhenDate(driverFoodWhereAndWhen.getFoodBoughtWhenDate());
        return driverFoodWhereAndWhenDao.save(existingDriverFoodWhereAndWhen);
    }

    public void deleteDriverFoodWhereAndWhen(Long id) {
        DriverFoodWhereAndWhen driverFoodWhereAndWhen = getDriverFoodWhereAndWhenById(id);
        driverFoodWhereAndWhenDao.delete(driverFoodWhereAndWhen);
    }
}