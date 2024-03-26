package companyMSE.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class DriverFoodBoughtWhatCostWhen {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define many-to-one relationship with CompanyMSEFinalTable
    @ManyToOne
    @JoinColumn(name = "food_bought_what_cost_when") 
    private CompanyMSEFinalTable foodBoughtWhatCostWhen;

    // Other properties related to food purchase
    private String whatFoodBought;
    private Double foodBoughtCost;
    private String foodBoughtWhenDate;

    // Constructors, getters, and setters
}
