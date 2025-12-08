package ma.enset.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.enset.billingservice.model.Customer;
import ma.enset.billingservice.model.Product;

import java.util.Date;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue
    private Long id;
    private Date billingDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;

    // ignorer par jpa
    @Transient
    private Customer customer;
}
