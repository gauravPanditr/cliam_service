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

    @Column(unique = true)
    private String claimNumber;

    private Long userId;

    private String vehicleNumber;

    private String policyNumber;

    private Double claimAmount;

    private LocalDate incidentDate;

    private String incidentLocation;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private ClaimStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}