package claimservice.Controller;


import claimservice.dto.ClaimRequestDto;
import claimservice.dto.ClaimResponse;
import claimservice.entity.Claim;
import claimservice.service.ClaimService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService claimService;

    @PostMapping
    public ResponseEntity<ClaimResponse>
    createClaim(
            @RequestBody ClaimRequestDto request) {

        return ResponseEntity.ok(
                claimService.createClaim(request)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Claim> getClaim(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                claimService.getClaim(id)
        );
    }
}