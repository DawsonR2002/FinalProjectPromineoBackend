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
public class TruckRepairCostDateAndVendor {




			
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;

		    private String truckRepairVendor;
		    private String truckRepairDate;
		    private Double truckRepairCost;

		    @OneToOne
		    @JoinColumn(name = "truck_repairs") 
		    private CompanyMSEFinalTable truckRepairs;
}
