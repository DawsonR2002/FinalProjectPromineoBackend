package companyMSE.controller.model;

import companyMSE.entity.CityAndStateOriginAndDestination;
import companyMSE.entity.CompanyMSEFinalTable;

public class CityAndStateOriginAndDestinationData {
	private String stateOrigin;
    private String stateDestination;
    private String cityOrigin;
    private String cityDestination;




    public CityAndStateOriginAndDestinationData(CityAndStateOriginAndDestination cityAndStateOriginAndDestination){
    	this.stateOrigin = cityAndStateOriginAndDestination.getStateOrigin();
    	this.stateDestination = cityAndStateOriginAndDestination.getStateDestination();
    	this.cityOrigin = cityAndStateOriginAndDestination.getCityOrigin();
    	this.cityDestination = cityAndStateOriginAndDestination.getCityDestination();

    }
}
