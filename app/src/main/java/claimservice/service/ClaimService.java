package claimservice.service;

import claimservice.dto.ClaimRequestDto;
import claimservice.dto.ClaimResponseDto;

public interface ClaimService {

    ClaimResponseDto createClaim(ClaimRequestDto request);
}