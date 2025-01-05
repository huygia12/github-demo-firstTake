package model.entities;

import java.time.LocalDateTime;
import java.util.List;
import lombok.*;
import javax.persistence.*;
import java.util.UUID;
import model.enums.PaymentOption;

/**
 *
 * @author huy
 */
@Entity
@Table(name = "Invoice")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {

    @Id
    @GeneratedValue
    private UUID invoiceId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private PaymentOption paymentMethod = PaymentOption.CASH;

    @Column(nullable = false)
    @Builder.Default
    private Integer customerMoney = 0;

    @Column(nullable = false)
    @Builder.Default
    private Float discount = 0.0f;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "shiftId", referencedColumnName = "shiftId")
    private Shift shift;
    
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<InvoiceProduct> invoiceProducts;
    
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}