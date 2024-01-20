package tn.arch.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Setter
@Getter
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReglement;

    @Column(nullable = false)
    private PaymentMethod paymentMethod;

//    @ManyToOne
//    @JoinColumn(name = "facture_id")
//    private Facture facture;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
