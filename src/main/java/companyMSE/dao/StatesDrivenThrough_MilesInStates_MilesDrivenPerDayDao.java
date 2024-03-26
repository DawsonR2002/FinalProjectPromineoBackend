package companyMSE.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import companyMSE.entity.StatesDrivenThrough_MilesInStates_MilesDrivenPerDay;

public interface StatesDrivenThrough_MilesInStates_MilesDrivenPerDayDao
		extends JpaRepository<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay, Long> {

}
