package companyMSE.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import companyMSE.controller.model.CityAndStateOriginAndDestinationData;
import lombok.Data;
@Entity
@Data
public class CityAndStateOriginAndDestination {



	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String cityOrigin;
		private String stateOrigin;
		private String cityDestination;
		private String stateDestination;

	    // Other fields and mappings

		@OneToOne
	    @JoinColumn(name = "originAndDestination") 
	    private CompanyMSEFinalTable originAndDestination;

}
