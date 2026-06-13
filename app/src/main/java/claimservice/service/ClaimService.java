package claimservice.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import claimservice.dto.ClaimRequestDto;
import claimservice.dto.ClaimResponse;
import claimservice.entity.Claim;
import claimservice.entity.ClaimStatus;
import claimservice.repository.ClaimRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClaimService {

    
    private final ClaimRepository claimRepository;


    public ClaimResponse createClaim(
            ClaimRequestDto request) {

        Claim claim = Claim.builder()
                .claimNumber("CLM-" + System.currentTimeMillis())
                .userId(request.getUserId())
                .vehicleNumber(request.getVehicleNumber())
                .policyNumber(request.getPolicyNumber())
                .claimAmount(request.getClaimAmount())
                .incidentDate(request.getIncidentDate())
                .incidentLocation(request.getIncidentLocation())
                .description(request.getDescription())
                .status(ClaimStatus.CREATED)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        Claim saved = claimRepository.save(claim);

        return ClaimResponse.builder()
                .id(saved.getId())
                .claimNumber(saved.getClaimNumber())
                .status(saved.getStatus())
                .build();
    }

    public Claim getClaim(Long id) {
        return claimRepository.findById(id)
                .orElseThrow();
    }
}