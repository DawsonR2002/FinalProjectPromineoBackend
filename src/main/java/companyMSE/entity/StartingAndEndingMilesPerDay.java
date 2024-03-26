package companyMSE.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class StartingAndEndingMilesPerDay {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



	@ManyToMany
    @JoinTable(
        name = "Quarterly_Fuel_and_Miles",
        joinColumns = @JoinColumn(name = "StartingAndEndingMilesPerDay"),
        inverseJoinColumns = @JoinColumn(name = "StatesDrivenThrough_MilesInStates_MilesDrivenPerDay")
    )
	private Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> quarterlyFuelAndMiles = new HashSet<>();
	
	
	@OneToOne
    @JoinColumn(name = "quarterlyFuelConnection") 
    private CompanyMSEFinalTable fuelQuarterlyConnection;
	
	
    

		    private Long startingMiles;
		    private Long endingMiles;
}
