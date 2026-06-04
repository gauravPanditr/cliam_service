package claimservice.service;

import claimservice.dto.CreateClaimRequest;
import claimservice.dto.ClaimResponse;
import claimservice.entity.Claim;

import claimservice.repository.ClaimRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {
    @Autowired
    private final ClaimRepository claimRepository;

    public ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public ClaimResponse createClaim(CreateClaimRequest req) {

        Claim claim = Claim.builder()
                .userId(req.getUserId())
                .policyId(req.getPolicyId())
                .description(req.getDescription())
                .incidentDate(req.getIncidentDate())
                .incidentLocation(req.getIncidentLocation())
                .build();

        claim = claimRepository.save(claim);

        return ClaimResponse.builder()
                .claimId(claim.getId())
                .status(claim.getStatus())
                .message("Claim created successfully")
                .build();
    }
}