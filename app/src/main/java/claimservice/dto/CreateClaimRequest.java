package claimservice.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateClaimRequest {
    private String userId;
    private String policyId;
    private String description;
    private LocalDate incidentDate;
    private String incidentLocation;
}