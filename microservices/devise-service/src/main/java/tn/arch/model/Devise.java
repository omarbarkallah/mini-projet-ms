package tn.arch.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
//import tn.atch.acrh.ClientService.model.Client;
//import tn.atch.acrh.ProductService.model.Product;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Setter
@Getter
public class Devise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private double totalAmount;
//    @ManyToOne
//    @JoinColumn(name = "client_id")
//    private Client client;
//    @ManyToMany
//    private List<Product> productToBePurchased;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
