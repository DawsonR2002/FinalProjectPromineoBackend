package companyMSE.controller;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyMSE.dao.StatesDrivenThrough_MilesInStates_MilesDrivenPerDayDao;
import companyMSE.entity.StatesDrivenThrough_MilesInStates_MilesDrivenPerDay;

@Service
public class StatesDrivenThrough_MilesInStates_MilesDrivenPerDayService {

    private final StatesDrivenThrough_MilesInStates_MilesDrivenPerDayDao repository;

    @Autowired
    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDayService(StatesDrivenThrough_MilesInStates_MilesDrivenPerDayDao repository) {
        this.repository = repository;
    }

    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDay createStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(StatesDrivenThrough_MilesInStates_MilesDrivenPerDay data) {
        return repository.save(data);
    }

    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDay getStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(Long id) {
        Optional<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> result = repository.findById(id);
        return result.orElseThrow(() -> new EntityNotFoundException("StatesDrivenThrough_MilesInStates_MilesDrivenPerDay"));
    }

    public StatesDrivenThrough_MilesInStates_MilesDrivenPerDay updateStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(Long id, StatesDrivenThrough_MilesInStates_MilesDrivenPerDay newData) {
        Optional<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> result = repository.findById(id);
        if (result.isPresent()) {
            newData.setId(id);
            return repository.save(newData);
        }
        throw new EntityNotFoundException("StatesDrivenThrough_MilesInStates_MilesDrivenPerDay");
    }

    public void deleteStatesDrivenThrough_MilesInStates_MilesDrivenPerDay(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("StatesDrivenThrough_MilesInStates_MilesDrivenPerDay");
        }
        repository.deleteById(id);
    }
}