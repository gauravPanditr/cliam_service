package claimservice.service;

import claimservice.dto.ClaimRequestDto;
import claimservice.dto.ClaimResponseDto;
import claimservice.entity.Claim;
import claimservice.repository.ClaimRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClaimServiceImp implements ClaimService {

    private final ClaimRepository claimRepository;

    @Override
    public ClaimResponseDto createClaim(ClaimRequestDto request) {

        Claim claim = Claim.builder()
                .userId(request.getUserId())
                .vehicleNumber(request.getVehicleNumber())
                .policyNumber(request.getPolicyNumber())
                .incidentLocation(request.getIncidentLocation())
                .description(request.getDescription())
                .status("SUBMITTED")
                .build();

        Claim savedClaim = claimRepository.save(claim);

        return ClaimResponseDto.builder()
                .claimId(savedClaim.getId())
                .userId(savedClaim.getUserId())
                .vehicleNumber(savedClaim.getVehicleNumber())
                .policyNumber(savedClaim.getPolicyNumber())
                .incidentLocation(savedClaim.getIncidentLocation())
                .description(savedClaim.getDescription())
                .status(savedClaim.getStatus())
                .build();
    }
}