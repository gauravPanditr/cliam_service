
 package claimservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claims")
public class CliamController {
 @GetMapping
    public String test() {
        return "Claim service working";
    }
    
}