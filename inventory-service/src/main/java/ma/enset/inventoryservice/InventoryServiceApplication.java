package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repository.ProductInventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductInventory productInventory) {
        return args -> {
            productInventory.save(Product.builder().name("product1").price(12000).quantity(22).build());
            productInventory.save(Product.builder().name("product2").price(15000).quantity(22).build());
            productInventory.save(Product.builder().name("product3").price(120).quantity(10).build());
            productInventory.save(Product.builder().name("product4").price(15).quantity(22).build());
            productInventory.save(Product.builder().name("product5").price(12000).quantity(3).build());
        };
    }
}
