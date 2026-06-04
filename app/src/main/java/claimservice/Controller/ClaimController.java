package claimservice.Controller;

import claimservice.dto.CreateClaimRequest;
import claimservice.dto.ClaimResponse;
import claimservice.service.ClaimService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClaimController {

    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @PostMapping("/claims")
    public ClaimResponse createClaim(@RequestBody CreateClaimRequest request) {
        return claimService.createClaim(request);
    }
}