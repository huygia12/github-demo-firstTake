package model.entities;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;
import model.enums.Gender;

/**
 *
 * @author huy
 */
@Entity
@Table(name = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue
    private UUID employeeId;

    @Column(nullable = false)
    private String fullname;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "storeId", referencedColumnName = "storeId")
    private Store store;
    
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}