package companyMSE.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data

public class TruckMiscCostDateAndVendor {





				
			    @Id
			    @GeneratedValue(strategy = GenerationType.IDENTITY)
			    private Long id;

			    private String truckMiscVendor;
			    private String truckMiscDate;
			    private Double truckMiscCost;

			    @ManyToOne
			    @JoinColumn(name = "truck_misc_costs") 
			    private CompanyMSEFinalTable truckMiscCosts;
}
