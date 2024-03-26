package companyMSE.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class TrailerRepairCostDateAndVendor {


		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String trailerRepairVendor;
	    private String trailerRepairDate;
	    private Double trailerRepairCost;

	    @OneToOne
	    @JoinColumn(name = "trailer_repairs") 
	    private CompanyMSEFinalTable trailerRepairs;

}
