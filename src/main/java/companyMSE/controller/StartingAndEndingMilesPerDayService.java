package companyMSE.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.StartingAndEndingMilesPerDayDao;
import companyMSE.entity.StartingAndEndingMilesPerDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartingAndEndingMilesPerDayService {

    private final StartingAndEndingMilesPerDayDao milesPerDayRepository;

    @Autowired
    public StartingAndEndingMilesPerDayService(StartingAndEndingMilesPerDayDao milesPerDayRepository) {
        this.milesPerDayRepository = milesPerDayRepository;
    }


	public StartingAndEndingMilesPerDay createStartingAndEndingMilesPerDay(StartingAndEndingMilesPerDay data) {
		return milesPerDayRepository.save(data);
	}

	public StartingAndEndingMilesPerDay getStartingAndEndingMilesPerDayById(Long id) {
		return milesPerDayRepository.findById(id).orElse(null);
	}

	public StartingAndEndingMilesPerDay updateStartingAndEndingMilesPerDay(Long id,
			StartingAndEndingMilesPerDay newData) {
		if (milesPerDayRepository.existsById(id)) {
            newData.setId(id);
            return milesPerDayRepository.save(newData);
        }
        return null;
	}

	public void deleteStartingAndEndingMilesPerDay(Long id) {
		milesPerDayRepository.deleteById(id);
	}
}
