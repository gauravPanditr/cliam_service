package claimservice.dto;

import claimservice.entity.ClaimStatus;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class ClaimResponse {

    private Long id;

    private String claimNumber;

    private ClaimStatus status;
}