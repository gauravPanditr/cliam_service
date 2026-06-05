package claimservice.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;



@Entity
@Table(name = "claims")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
private String vehicleNumber;

    private String policyNumber;
    // @ManyToOne
    // @JoinColumn(name = "vehicle_id")
    // private Vehicle vehicle;

    // @ManyToOne
    // @JoinColumn(name = "policy_id")
    // private Policy policy;

    private LocalDate incidentDate;

    private String incidentLocation;

    @Column(length = 1000)
    private String description;

    private String status;

    private LocalDateTime createdAt;
}