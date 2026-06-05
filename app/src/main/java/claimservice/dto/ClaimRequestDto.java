package claimservice.dto;

import lombok.Data;

@Data
public class ClaimRequestDto {

    private Long userId;
    private String vehicleNumber;
    private String policyNumber;
    private String incidentLocation;
    private String description;
}