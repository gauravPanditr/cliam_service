package claimservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliam {

    @Id
    @GeneratedValue
    private UUID id;

    private String userId;
    private String policyId;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDate incidentDate;
    private String incidentLocation;

    @Enumerated(EnumType.STRING)
    private ClaimStatus status;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        status = ClaimStatus.SUBMITTED;
    }
}