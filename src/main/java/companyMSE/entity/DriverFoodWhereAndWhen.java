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
public class DriverFoodWhereAndWhen {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String foodBoughtWhere;
    private String foodBoughtWhenDate;

    @OneToOne
    @JoinColumn(name = "company_mse_final_table_id") 
    private CompanyMSEFinalTable foodBoughtWhereAndWhen;

}
