package claimservice.dto;

import claimservice.entity.ClaimStatus;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ClaimResponse {
    private UUID claimId;
    private ClaimStatus status;
    private String message;
}