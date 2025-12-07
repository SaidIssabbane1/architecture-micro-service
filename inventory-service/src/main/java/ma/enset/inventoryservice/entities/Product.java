package ma.enset.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Product {
    @Id @GeneratedValue

    private int id;
    private String name;
    private double price;
    private int quantity;
}
