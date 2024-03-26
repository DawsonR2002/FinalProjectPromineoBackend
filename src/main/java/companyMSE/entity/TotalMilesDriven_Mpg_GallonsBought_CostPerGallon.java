package companyMSE.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class TotalMilesDriven_Mpg_GallonsBought_CostPerGallon {

	
	

		

			
		

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
		    
		    Long totalMilesDriven;
		    Double mpg;
		    Long gallonsBought;
		    Double costPerGallon;
	
	@OneToMany(mappedBy = "milesDriven")
    private Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> totalMilesDrivenMPG = new HashSet<>();
	
    @OneToOne
    @JoinColumn(name = "TMD_MPG_GB_CPG") 
    private CompanyMSEFinalTable TMD_MPG_GB_CPG;
    

}
