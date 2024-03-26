package companyMSE.service;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
/*
Entity:

An entity represents a real-world object or concept that is persisted in a database. It typically 
corresponds to a database table. In Java, entities are often annotated with @Entity 
(for JPA/Hibernate) or similar annotations to indicate that they are persisted objects.

Entities contain fields that map to columns in the database table and may include relationships
to other entities. They are often used to model the data layer of an application.
Examples of entities include User, Product, Order, etc.

-------------------------------------------------------------------
Service:

A service is a Java class that contains business logic or application-specific functionality. Services 
encapsulate operations that can be performed on entities or other domain objects.

Services orchestrate interactions between different parts of the application, such as data access 
(via repositories or DAOs), validation, transformation, and other business rules.

Services are often responsible for implementing use cases or business processes defined by the application requirements.
Examples of services include UserService, ProductService, OrderService, etc.
 */
import org.springframework.stereotype.Service;

import companyMSE.controller.model.CompanyMSEFinalTableData;
import companyMSE.dao.CityAndStateOriginAndDestinationDao;
import companyMSE.dao.CompanyMSEFinalTableDao;
import companyMSE.dao.DriverFoodBoughtWhatCostWhenDao;
import companyMSE.dao.DriverFoodWhereAndWhenDao;
import companyMSE.dao.StartingAndEndingMilesPerDayDao;
import companyMSE.dao.StatesDrivenThrough_MilesInStates_MilesDrivenPerDayDao;
import companyMSE.dao.TotalMilesDriven_Mpg_GallonsBought_CostPerGallonDao;
import companyMSE.dao.TrailerRepairCostDateAndVendorDao;
import companyMSE.dao.TruckMiscCostDateAndVendorDao;
import companyMSE.dao.TruckRepairCostDateAndVendorDao;
import companyMSE.entity.CompanyMSEFinalTable;

@Service
public class CompanyMSEService {

	// Service methods and business logic go here

	/*
	 * An instance variable, also known as a member variable or an instance field,
	 * is a variable defined within a class but outside of any method, constructor,
	 * or block. Each object (or instance) of the class has its own copy of the
	 * instance variables, separate from other objects of the same class.
	 */

	/*
	 * In Spring Framework, @Autowired is used for automatic dependency injection.
	 * When you annotate a field, setter method, or constructor with @Autowired,
	 * Spring automatically resolves and injects the dependency (bean) into that
	 * component at runtime. This simplifies the process of managing dependencies
	 * and makes your code more flexible and easier to maintain.
	 * 
	 * Here's what @Autowired does in different contexts:
	 * --------------------------------------------------------- Field Injection:
	 * 
	 * @Autowired private SomeDependency someDependency;
	 * 
	 * With field injection, Spring automatically injects a bean of type
	 * SomeDependency into the someDependency field when the bean containing this
	 * field is instantiated. ----------------------------------------------- Setter
	 * Injection:
	 * 
	 * 
	 * private SomeDependency someDependency;
	 * 
	 * @Autowired public void setSomeDependency(SomeDependency someDependency) {
	 * this.someDependency = someDependency; } With setter injection, Spring
	 * automatically calls the setter method and passes the bean of type
	 * SomeDependency when instantiating the bean containing this setter.
	 * 
	 * ----------------------------------------------------------- Constructor
	 * Injection:
	 * 
	 * private final SomeDependency someDependency;
	 * 
	 * @Autowired public MyClass(SomeDependency someDependency) {
	 * this.someDependency = someDependency; } With constructor injection, Spring
	 * automatically provides the dependency SomeDependency when creating an
	 * instance of MyClass.
	 * -----------------------------------------------------------
	 * 
	 * In all cases, Spring resolves the dependency by looking for a bean of the
	 * required type in the application context. If there's exactly one bean of the
	 * required type, Spring injects it. If there are multiple beans of the same
	 * type, Spring may use additional criteria (like bean name or qualifiers) to
	 * determine which bean to inject.
	 * 
	 * Note that @Autowired can be used with constructor, setter, or field
	 * injection. It's generally recommended to use constructor injection whenever
	 * possible, as it results in immutable objects and makes dependencies explicit.


	public int getHighestWeeklyDateId() {
		return weeklyDataHighestId;
	}
	
	public Scanner getDaysMonthsAndYears(String weekDay, String dayMonthOrYear) {
		if((weekDay.toLowerCase() == "monday") || (weekDay.toLowerCase() == "tuesday") || (weekDay.toLowerCase() == "wednesday")
				|| (weekDay.toLowerCase() == "thursday") || (weekDay.toLowerCase() == "friday")) {
			if(dayMonthOrYear.toLowerCase() == "day") {
				System.out.println("Enter the day for the weekday you wish to view in the form dd");
				Scanner userInputDay = new Scanner(System.in);
				return userInputDay;
			}
			
			else if(dayMonthOrYear.toLowerCase() == "month") {
				System.out.println("Enter the month for the weekday you wish to view in the form mm");
				Scanner userInputMonth = new Scanner(System.in);
				return userInputMonth;
			}
			
			else if(dayMonthOrYear.toLowerCase() == "year") {
				System.out.println("Enter the year for the weekday you wish to view in the form yyyy");
				Scanner userInputYear = new Scanner(System.in);
				return userInputYear;
			}
			
			else {
				//should not get here but better safe then sorry
				System.out.println("Error line 114 CompanyMSEService, enter anything to continue");
				Scanner userInputYear = new Scanner(System.in);
				return userInputYear;
			}
		}
		else {
			//should not get here but better safe then sorry
			System.out.println("Error line 127 CompanyMSEService, enter anything to continue");
			Scanner userInputYear = new Scanner(System.in);
			return userInputYear;
		}
	}
	public int getDateTableID() {
		// TODO Auto-generated method stub
			System.out.println("What month do you want to view? please insert the Whole name");
			Scanner userInputDateMonthAsString = new Scanner(System.in);
			
			System.out.println("What day do you want to view, you will see the whole week. please insert dd");
			Scanner userInputDateDayAsString = new Scanner(System.in);
			
			System.out.println("What year do you want to view? please insert yyyy");
			Scanner userInputDateYearAsString = new Scanner(System.in);
			
			
			int idWorkingWith = getHighestWeeklyDateId();
			
				//figure this out later
			while(idWorkingWith > 0) {
				//if(){
					//return
				//}
				idWorkingWith--;
				
			}
			
			//Date was not found
			return -1;
		
	}
*/
	@Autowired
	private CompanyMSEFinalTableDao companyMSEFinalTableDao;

//	@Autowired
//	private DriverFoodCostsDao driverFoodCostsDao;



	@Autowired
	private CityAndStateOriginAndDestinationDao cityAndStateOriginAndDestinationDao;

	@Autowired
	private DriverFoodBoughtWhatCostWhenDao driverFoodBoughtWhatCostWhenDao;

	@Autowired
	private DriverFoodWhereAndWhenDao driverFoodWhereAndWhenDao;

	@Autowired
	private StartingAndEndingMilesPerDayDao startingAndEndingMilesPerDayDao;
	
	@Autowired
	private StatesDrivenThrough_MilesInStates_MilesDrivenPerDayDao statesDrivenThrough_MilesInStates_MilesDrivenPerDayDao;

	@Autowired
	private TotalMilesDriven_Mpg_GallonsBought_CostPerGallonDao totalMilesDriven_Mpg_GallonsBought_CostPerGallonDao;

	@Autowired
	private TrailerRepairCostDateAndVendorDao trailerRepairCostDateAndVendorDao;

	@Autowired
	private TruckMiscCostDateAndVendorDao truckMiscCostDateAndVendorDao;
	
	@Autowired
	private TruckRepairCostDateAndVendorDao truckRepairCostDateAndVendorDao;

	// might be an error in here relating to the weeklyTableDataId




//	private CompanyMSEFinalTable convertToCompanyMSEFinalTable(CompanyMSEFinalTableData weeklyDataInput) {
//
//		CompanyMSEFinalTable table = new CompanyMSEFinalTable();
//
//		// Set the value using the setter method generated by Lombok
//		table.setServices(new CompanyMSEService());
//
//		// Get the value using the getter method generated by Lombok
//		CompanyMSEService service = table.getServices();
//
//		return table;
//	}
//
////-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
//	private DriverFoodCosts findDriverFoodCostsById(Long finalTableId, Long driverFoodCostsId) {
//
//		DriverFoodCosts driverFoodCosts = driverFoodCostsDao.findById(driverFoodCostsId)
//				.orElseThrow(() -> new NoSuchElementException("Driver Food cost Id not found"));
//
//		if (!finalTableId.equals(driverFoodCostsId)) {
//			throw new IllegalArgumentException("driver food cost id is invalid");
//		}
//
//		return driverFoodCosts;
//	}
//
//	private DriverFoodCosts findOrCreateDriverFoodCosts(Long finalTableId, Long driverFoodCostsId) {
//
//		if (finalTableId == null) {
//			return new DriverFoodCosts();
//		}
//
//		return findDriverFoodCostsById(finalTableId, driverFoodCostsId);
//	}
//
//	private void copyDriverFields(CompanyMSEFinalTable sendToThisFoodExpense, DriverFoodCosts getFromThisFoodExpense) {
//
//		sendToThisFoodExpense.setCityBoughtIn(getFromThisFoodExpense.getCityBoughtIn());
//		sendToThisFoodExpense.setCostOfBoughtFood(getFromThisFoodExpense.getCostOfBoughtFood());
//		sendToThisFoodExpense.setDateBought(getFromThisFoodExpense.getDateBought());
//		sendToThisFoodExpense.setDriverFoodCostsId(getFromThisFoodExpense.getDriverFoodCostsId());
//		sendToThisFoodExpense.setStateBoughtIn(getFromThisFoodExpense.getStateBoughtIn());
//		sendToThisFoodExpense.setWhatWasBought(getFromThisFoodExpense.getWhatWasBought());
//	}
//
//	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//	private QuarterlyMiles_MilesInStates_MPG findQuarterlyMiles_MilesInStates_MPGById(Long finalTableId,
//			Long quarterlyMiles_MilesInStates_MPG_Id) {
//
//		QuarterlyMiles_MilesInStates_MPG quarterlyMiles_MilesInStates_MPG = quarterlyMiles_MilesInStates_MPGDao
//				.findById(quarterlyMiles_MilesInStates_MPG_Id)
//				.orElseThrow(() -> new NoSuchElementException("quarterly miles Id not found"));
//
//		if (!finalTableId.equals(quarterlyMiles_MilesInStates_MPG.getQuarterlyMiles_MilesInStates_MPG_Id())) {
//			throw new IllegalArgumentException("quarterly miles Id is invalid");
//		}
//
//		return quarterlyMiles_MilesInStates_MPG;
//	}
//
//	private QuarterlyMiles_MilesInStates_MPG findOrCreateQuarterlyMiles_MilesInStates_MPG(Long finalTableId,
//			Long quarterlyMiles_MilesInStates_MPG_Id) {
//
//		if (finalTableId == null) {
//			return new QuarterlyMiles_MilesInStates_MPG();
//		}
//
//		return findQuarterlyMiles_MilesInStates_MPGById(finalTableId, quarterlyMiles_MilesInStates_MPG_Id);
//	}
//
//	private void copyQuarterlyMilesFields(CompanyMSEFinalTable sendToThisQuarterlyMiles,
//			QuarterlyMiles_MilesInStates_MPG getFromThisQuarterlyMiles) {
//
//		sendToThisQuarterlyMiles.setStartingMiles(getFromThisQuarterlyMiles.getStartingMiles());
//		sendToThisQuarterlyMiles.setQuarterlyMiles_MilesInStates_MPG_Id(getFromThisQuarterlyMiles.getQuarterlyMiles_MilesInStates_MPG_Id());
//		sendToThisQuarterlyMiles.setEndingMiles(getFromThisQuarterlyMiles.getEndingMiles());
//		sendToThisQuarterlyMiles.setStatesDrivenThrough(getFromThisQuarterlyMiles.getStatesDrivenThrough());
//		sendToThisQuarterlyMiles.setTotalGallons(getFromThisQuarterlyMiles.getTotalGallons());
//		sendToThisQuarterlyMiles.setMPG(getFromThisQuarterlyMiles.getMPG());
//		sendToThisQuarterlyMiles.setMilesInStates(getFromThisQuarterlyMiles.getMilesInStates());
//		sendToThisQuarterlyMiles.setMilesDrivenPerDay(getFromThisQuarterlyMiles.getMilesDrivenPerDay());
//		sendToThisQuarterlyMiles.setTotalMilesDriven(getFromThisQuarterlyMiles.getTotalMilesDriven());
//	}
//
//	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//	private QuarterlyTruckFuelCost findQuarterlyTruckFuelCostById(Long finalTableId, Long quarterlyTruckFuelCostId) {
//
//		QuarterlyTruckFuelCost quarterlyTruckFuelCost = quarterlyTruckFuelCostDao.findById(quarterlyTruckFuelCostId)
//				.orElseThrow(() -> new NoSuchElementException("Quarterly Fuel Cost Id not found"));
//
//		if (!finalTableId.equals(quarterlyTruckFuelCost.getQuarterlyTruckFuelCostId())) {
//			throw new IllegalArgumentException("Quarterly Fuel Cost Id is invalid");
//		}
//
//		return quarterlyTruckFuelCost;
//	}
//
//	private QuarterlyTruckFuelCost findOrCreateQuarterlyTruckFuelCost(Long finalTableId,
//			Long quarterlyTruckFuelCostId) {
//
//		if (finalTableId == null) {
//			return new QuarterlyTruckFuelCost();
//		}
//
//		return findQuarterlyTruckFuelCostById(finalTableId, quarterlyTruckFuelCostId);
//	}
//
//	private void copyEmployeeFields(CompanyMSEFinalTable sendToThisQuarterlyFuelExpense, QuarterlyTruckFuelCost getFromThisQuarterlyFuelExpense) {
//
//		sendToThisQuarterlyFuelExpense.setQuarterlyTruckFuelCostId(getFromThisQuarterlyFuelExpense.getQuarterlyTruckFuelCostId());
//		sendToThisQuarterlyFuelExpense.setCityOrigin(getFromThisQuarterlyFuelExpense.getCityOrigin());
//		sendToThisQuarterlyFuelExpense.setCityDestination(getFromThisQuarterlyFuelExpense.getCityDestination());
//		sendToThisQuarterlyFuelExpense.setStateOrigin(getFromThisQuarterlyFuelExpense.getStateOrigin());
//		sendToThisQuarterlyFuelExpense.setStateDestinaton(getFromThisQuarterlyFuelExpense.getStateDestinaton());
//		sendToThisQuarterlyFuelExpense.setTotalFuelCostPerWeek(getFromThisQuarterlyFuelExpense.getTotalFuelCostPerWeek());
//		sendToThisQuarterlyFuelExpense.setLocationsStoppedInForFuel(getFromThisQuarterlyFuelExpense.getLocationsStoppedInForFuel());
//	}
//
//	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//	private TrailerRepairsCost findTrailerRepairsCostById(Long finalTableId, Long trailerRepairsCostId) {
//
//		TrailerRepairsCost trailerRepairsCostCosts = trailerRepairsCostDao.findById(trailerRepairsCostId)
//				.orElseThrow(() -> new NoSuchElementException("Trailer Repair cost Id not found"));
//
//		if (!finalTableId.equals(trailerRepairsCostCosts.getTrailerRepairsCostID())) {
//			throw new IllegalArgumentException("Trailer Repair cost Id is invalid");
//		}
//
//		return trailerRepairsCostCosts;
//	}
//
//	private TrailerRepairsCost findOrCreateTrailerRepairsCost(Long finalTableId, Long trailerRepairsCostId) {
//
//		if (finalTableId == null) {
//			return new TrailerRepairsCost();
//		}
//
//		return findTrailerRepairsCostById(finalTableId, trailerRepairsCostId);
//	}
//
//	private void copyTrailerRepairsCostFields(CompanyMSEFinalTable sendToThisTrailerExpense, TrailerRepairsCost getFromThisTrailerExpense) {
//
//		sendToThisTrailerExpense.setCostTrailerRepairs(getFromThisTrailerExpense.getCostTrailerRepairs());
//		sendToThisTrailerExpense.setTrailerRepairsCostID(getFromThisTrailerExpense.getTrailerRepairsCostID());
//		sendToThisTrailerExpense.setVendorTrailerRepairs(getFromThisTrailerExpense.getVendorTrailerRepairs());
//
//	}
//
//	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//	private TruckMiscCost findTruckMiscCostsById(Long finalTableId, Long truckMiscCostsId) {
//
//		TruckMiscCost truckMiscCosts = truckMiscCostDao.findById(truckMiscCostsId)
//				.orElseThrow(() -> new NoSuchElementException("Truck Misc cost Id not found"));
//
//		if (!finalTableId.equals(truckMiscCostsId)) {
//			throw new IllegalArgumentException("Truck Misc cost Id is invalid");
//		}
//
//		return truckMiscCosts;
//	}
//
//	private TruckMiscCost findOrCreateTruckMiscCosts(Long finalTableId, Long truckMiscCostsId) {
//
//		if (finalTableId == null) {
//			return new TruckMiscCost();
//		}
//
//		return findTruckMiscCostsById(finalTableId, truckMiscCostsId);
//	}

//	private void copyTruckMiscCostFields(CompanyMSEFinalTable sendToThisMiscExpense, TruckMiscCost getFromThisMiscExpense) {
//
//		sendToThisMiscExpense.setTruckMiscCostId(getFromThisMiscExpense.getTruckMiscCostId());
//		sendToThisMiscExpense.setCostTruckMisc(getFromThisMiscExpense.getCostTruckMisc());
//		sendToThisMiscExpense.setVendorTruckMisc(getFromThisMiscExpense.getVendorTruckMisc());
//
//	}
	// -----------------------------------------------------------------------------------------------------------------------------
//
//	private TruckRepairsCost findTruckRepairCostsById(Long finalTableId, Long truckRepairsCostId) {
//
//		TruckRepairsCost truckRepairsCosts = truckRepairsCostDao.findById(truckRepairsCostId)
//				.orElseThrow(() -> new NoSuchElementException("Truck Repairs cost Id not found"));
//
//		if (!finalTableId.equals(truckRepairsCosts.getTruckRepairsCostId())) {
//			throw new IllegalArgumentException("Truck Repairs cost Id is invalid");
//		}
//
//		return truckRepairsCosts;
//	}

//	private TruckRepairsCost findOrCreateTruckRepairCosts(Long finalTableId, Long truckRepairsCostId) {
//
//		if (finalTableId == null) {
//			return new TruckRepairsCost();
//		}
//
//		return findTruckRepairCostsById(finalTableId, truckRepairsCostId);
//	}

//	private void copyTruckRepairCostsFields(CompanyMSEFinalTable sendToThisTruckRepairExpense, TruckRepairsCost getFromThisTruckRepairExpense) {
//
//		sendToThisTruckRepairExpense.setVendorTruckRepairs(getFromThisTruckRepairExpense.getVendorTruckRepairs());
//		sendToThisTruckRepairExpense.setTruckRepairsCostId(getFromThisTruckRepairExpense.getTruckRepairsCostId());
//		sendToThisTruckRepairExpense.setCostTruckRepairs(getFromThisTruckRepairExpense.getCostTruckRepairs());
//
//	}

//	public void copyCompanyMSEFinalTableFields(CompanyMSEFinalTable companyMSEFinalTable,
//			CompanyMSEFinalTableData companyMSEFinalTableData) {
//		companyMSEFinalTable.setCityBoughtIn(companyMSEFinalTableData.getCityBoughtIn());
//		companyMSEFinalTable.setCityDestination(companyMSEFinalTableData.getCityDestination());
//		companyMSEFinalTable.setCityOrigin(companyMSEFinalTableData.getCityOrigin());
//		companyMSEFinalTable.setCostOfBoughtFood(companyMSEFinalTableData.getCostOfBoughtFood());
//		companyMSEFinalTable.setCostTrailerRepairs(companyMSEFinalTableData.getCostTrailerRepairs());
//		companyMSEFinalTable.setCostTruckMisc(companyMSEFinalTableData.getCostTruckMisc());
//		companyMSEFinalTable.setCostTruckRepairs(companyMSEFinalTableData.getCostTruckRepairs());
//		companyMSEFinalTable.setDateBought(companyMSEFinalTableData.getDateBought());
//		companyMSEFinalTable.setDriverFoodCostsId(companyMSEFinalTableData.getDriverFoodCostsId());
//		companyMSEFinalTable.setEndingMiles(companyMSEFinalTableData.getEndingMiles());
//		companyMSEFinalTable.setLocationsStoppedInForFuel(companyMSEFinalTableData.getLocationsStoppedInForFuel());
//		companyMSEFinalTable.setMilesDrivenPerDay(companyMSEFinalTableData.getMilesDrivenPerDay());
//		companyMSEFinalTable.setMilesInStates(companyMSEFinalTableData.getMilesInStates());
//		companyMSEFinalTable.setMPG(companyMSEFinalTableData.getMPG());
//		companyMSEFinalTable.setQuarterlyMiles_MilesInStates_MPG_Id(companyMSEFinalTableData.getQuarterlyMiles_MilesInStates_MPG_Id());
//		companyMSEFinalTable.setQuarterlyTruckFuelCostId(companyMSEFinalTableData.getQuarterlyTruckFuelCostId());
//		companyMSEFinalTable.setStartingMiles(companyMSEFinalTableData.getStartingMiles());
//		companyMSEFinalTable.setStateBoughtIn(companyMSEFinalTableData.getStateBoughtIn());
//		companyMSEFinalTable.setStateDestinaton(companyMSEFinalTableData.getStateDestinaton());
//		companyMSEFinalTable.setStateOrigin(companyMSEFinalTableData.getStateOrigin());
//		companyMSEFinalTable.setStatesDrivenThrough(companyMSEFinalTableData.getStatesDrivenThrough());
//		companyMSEFinalTable.setTotalFuelCostPerWeek(companyMSEFinalTableData.getTotalFuelCostPerWeek());
//		companyMSEFinalTable.setTotalGallons(companyMSEFinalTableData.getTotalGallons());
//		companyMSEFinalTable.setTotalMilesDriven(companyMSEFinalTableData.getTotalMilesDriven());
//		companyMSEFinalTable.setTrailerRepairsCostID(companyMSEFinalTableData.getTrailerRepairsCostID());
//		companyMSEFinalTable.setTruckMiscCostId(companyMSEFinalTableData.getTruckMiscCostI());
//		companyMSEFinalTable.setTruckRepairsCostId(companyMSEFinalTableData.getTruckRepairsCostId());
//		companyMSEFinalTable.setVendorTrailerRepairs(companyMSEFinalTableData.getVendorTrailerRepairs());
//		companyMSEFinalTable.setVendorTruckMisc(companyMSEFinalTableData.getVendorTruckMisc());
//		companyMSEFinalTable.setVendorTruckRepairs(companyMSEFinalTableData.getVendorTruckRepairs());
//		companyMSEFinalTable.setWhatWasBought(companyMSEFinalTableData.getWhatWasBought());
//
//	}

	public CompanyMSEFinalTable findOrCreateCompanyMSEFinalTable(Long companyMSEFinalTableId) {
		if (Objects.isNull(companyMSEFinalTableId)) {
			return new CompanyMSEFinalTable();
		}

		else {
			return findCompanyMSEFinalTableById(companyMSEFinalTableId);
		}
	}

	public CompanyMSEFinalTable findCompanyMSEFinalTableById(Long companyMSEFinalTableId) {
		// TODO Auto-generated method stub
		CompanyMSEFinalTable mseFinalTableReturnable = findCompanyMSEFinalTableById(companyMSEFinalTableId);
		return mseFinalTableReturnable;
	}

	public void deleteCompanyMSEFinalTableById(Long companyMSEFinalTableId) {
		if(findCompanyMSEFinalTableById(companyMSEFinalTableId) != null) {
			findCompanyMSEFinalTableById(companyMSEFinalTableId).equals(null);
		}
		
	}

	

	

	
	

//	@Transactional
//	public void deleteCompanyMSEFinalTableById(Long companyMSEFinalTableId) {
//		CompanyMSEFinalTable finalTable = findCompanyMSEFinalTableById(companyMSEFinalTableId);
//
//		// Ask Mike what to put into this, or if it is even necessary
//		// finalTable.getEmployees().forEach(employee -> employeeDao.delete(employee));
//
//		// Delete the finalTable
//		companyMSEFinalTableDao.delete(finalTable);
//	}
	 
}