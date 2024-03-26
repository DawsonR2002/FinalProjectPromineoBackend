package companyMSE.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@Table(name = "company_mse_final_table")
public class CompanyMSEFinalTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Double driverFoodTotalCost;

    // Other fields and mappings

    @OneToOne(mappedBy = "foodBoughtWhereAndWhen")
    private DriverFoodWhereAndWhen foodBoughtWhereAndWhen;

    // Other fields and mappings

    @OneToOne(mappedBy = "originAndDestination")
    private CityAndStateOriginAndDestination originAndDestination;
    
    @OneToOne(mappedBy = "trailerRepairs")
    private TrailerRepairCostDateAndVendor trailerRepairs;
    
    @OneToOne(mappedBy = "truckRepairs")
    private TruckRepairCostDateAndVendor truckRepairs;
    
    @OneToMany(mappedBy = "truckMiscCosts")
    private Set<TruckMiscCostDateAndVendor> truckMiscCosts = new HashSet<>();
    
    @OneToMany(mappedBy = "foodBoughtWhatCostWhen")
    private Set<DriverFoodBoughtWhatCostWhen> foodBoughtWhatCostWhen = new HashSet<>();

    @OneToOne(mappedBy = "fuelQuarterlyConnection")
    private StartingAndEndingMilesPerDay fuelQuarterlyConnection;
    
    @OneToMany(mappedBy = "statesDrivenThroughSet")
    private Set<StatesDrivenThrough_MilesInStates_MilesDrivenPerDay> statesDrivenThroughSet = new HashSet<>();

    @OneToOne(mappedBy = "TMD_MPG_GB_CPG")
    private TotalMilesDriven_Mpg_GallonsBought_CostPerGallon TMD_MPG_GB_CPG;

	
//	vendorTruckRepair = getVendorTruckRepair();
//	truckRepairCost = getTruckRepairCost();
//	truckRepairsDate = getTruckRepairsDate();
	
//	vendorTruckMisc = getVendorTruckMisc();
//	truckMiscPurchaseCost = getTruckMiscPurchaseCost();
//	truckMiscPurchaseDate = getTruckMiscPurchaseDate();
	


    



    // Other fields and mappings

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/***********************************@ this entity to other entity *******************************************************/
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /*-----------------------------------
     * DriverFoodCosts CLASS
     * 
     * CITY BOUGHT IN (MANY TO ONE)
     * STATE BOUGHT IN (MANY TO ONE)
     * WHAT WAS BOUGHT (MANY TO ONE)
     * TOTAL COST (MANY TO ONE)
     * DATE BOUGHT (MANY TO ONE)
     * -------------------------------
     * THIS CLASS
     * 
     * CITY BOUGHT IN (ONE TO MANY)
     * STATE BOUGHT IN (ONE TO MANY)
     * WHAT WAS BOUGHT (ONE TO MANY)
     * TOTAL COST (ONE TO MANY)
     * DATE BOUGHT (ONE TO MANY)
     *------------------------------------*/
    


    /*
     public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // the primary key
   private Long petStoreId; // may need to change this to int

    private String petStoreName;
    private String petStoreAddress;
    private String petStoreCity;
    private String petStoreState;
    private String petStoreZip; // unlikely but this may need to be an int
    private String petStorePhone;

    @ManyToMany(cascade = CascadeType.PERSIST)
    
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JoinTable(name = "pet_store_customer", joinColumns = @JoinColumn(name = "pet_store_id"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
    private Set<Customer> customers = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Employee> employees = new HashSet<>();

}

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // the primary key
    private Long employeeId;

    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhone;
    private String employeeJobTitle;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_store_id")
    private PetStore petStore;

    // Constructors, getters, setters, and other methods if needed
}

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // the primary key
    private Long customerId;

    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
    private Set<PetStore> petStores = new HashSet<>();

    // Constructors, getters, setters, and other methods if needed
}




     */
    
    
    
    // Add the property for the criteria
    private String someCriteria;

    // Constructors, getters, and setters

    public CompanyMSEFinalTable() {
    }

    public CompanyMSEFinalTable(String someCriteria) {
        this.someCriteria = someCriteria;
    }

    // Getters and setters for other properties (if any)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSomeCriteria() {
        return someCriteria;
    }

    public void setSomeCriteria(String someCriteria) {
        this.someCriteria = someCriteria;
    }
    
} 
//    
//
//    @Column(name = "city_bought_in_string", nullable = false)
//    private String cityBoughtIn; // Example column definition
//
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    @OneToOne(mappedBy = "cityBoughtIn")
//    private DriverFoodCosts cityBoughtInDFC;
//  
//  
//    @Column(name = "total_cost_double", nullable = false)
//    private Double totalCost; // Example column definition
//  //properly set up
//  @EqualsAndHashCode.Exclude
//	@ToString.Exclude
//	@OneToMany(mappedBy = "stateBoughtIn")
//  //private TruckRepairsCost costTruckRepairs;
//	//TruckRepairsCost costTruckRepairs;
//  private Set<DriverFoodCosts> totalCostDFC = new HashSet<>();
//  
//
//  @Column(name = "state_bought_in_string", nullable = false)
//  private String stateBoughtIn; // Example column definition
////properly set up
//@EqualsAndHashCode.Exclude
//	@ToString.Exclude
//	@OneToMany(mappedBy = "stateBoughtIn")
////private TruckRepairsCost costTruckRepairs;
//	//TruckRepairsCost costTruckRepairs;
//private Set<DriverFoodCosts> stateBoughtInDFC = new HashSet<>();
//
//  @Column(name = "what_was_bought_string", nullable = false)
//  private String whatWasBought; // Example column definition
////    //properly set up
//    @EqualsAndHashCode.Exclude
//	@ToString.Exclude
//	@OneToMany(mappedBy = "whatWasBought")
//    //private TruckRepairsCost costTruckRepairs;
//	//TruckRepairsCost costTruckRepairs;
//    private Set<DriverFoodCosts> whatWasBoughtDFC = new HashSet<>();
////
//    
//    @Column(name = "date_bought_string", nullable = false)
//    private String dateBought; // Example column definition
////    //properly set up
//	@EqualsAndHashCode.Exclude
//	@ToString.Exclude
//	@OneToMany(mappedBy = "dateBought")
//	//private List<TruckRepairsCost> vendorTruckRepairsList;
//	//TruckRepairsCost vendorTruckRepairsList;
//	private Set<DriverFoodCosts> dateBoughtDFC = new HashSet<>();
	
    /*-----------------------------------
     * TrailerRepairsCost CLASS
     * 
     * VENDOR (MANY TO ONE)
     * TRAILER REPAIR COST (MANY TO ONE)
     * REPAIRS DATE (MANY TO ONE)
     * -------------------------------
     * THIS CLASS
     * 
     * VENDOR (ONE TO MANY)
     * TRAILER REPAIR COST (ONE TO MANY)
     * REPAIRS DATE (ONE TO MANY)
     *------------------------------------*/
//
	
	
    
    
