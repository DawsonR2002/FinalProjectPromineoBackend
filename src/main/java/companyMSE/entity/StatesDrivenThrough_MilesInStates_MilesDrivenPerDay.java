package companyMSE.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class StatesDrivenThrough_MilesInStates_MilesDrivenPerDay {
	

		
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    
	    
	    // Other properties related to food purchase
	    private String statesDrivenThrough;
	    private Long milesInStates;
	    private Long milesDrivenPerDay;

	    
	    
	    

	    
	    @ManyToMany(mappedBy = "quarterlyFuelAndMiles")
	    private Set<StartingAndEndingMilesPerDay> quarterlyFuelAndMiles = new HashSet<>();
	    
	    @ManyToOne
	    @JoinColumn(name = "milesDriven") 
	    private TotalMilesDriven_Mpg_GallonsBought_CostPerGallon milesDriven;
	    
	    @ManyToOne
	    @JoinColumn(name = "statesDrivenThroughSet") 
	    private CompanyMSEFinalTable statesDrivenThroughSet;
	    
}
