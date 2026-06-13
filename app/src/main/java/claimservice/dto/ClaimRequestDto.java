package claimservice.dto;

import lombok.Data;
import java.time.LocalDate;



@Data
public class ClaimRequestDto {

    private Long userId;

    private String vehicleNumber;

    private String policyNumber;

    private Double claimAmount;

    private LocalDate incidentDate;

    private String incidentLocation;

    private String description;
}