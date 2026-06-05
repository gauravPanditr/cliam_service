package claimservice.Controller;


import claimservice.dto.ClaimRequestDto;

import claimservice.dto.ClaimResponseDto;
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
    public ClaimResponseDto createClaim(@RequestBody ClaimRequestDto request) {
        return claimService.createClaim(request);
    }
}