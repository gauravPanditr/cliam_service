package claimservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClaimResponseDto {

    private Long claimId;
    private Long userId;
    private String vehicleNumber;
    private String policyNumber;
    private String incidentLocation;
    private String description;
    private String status;
}