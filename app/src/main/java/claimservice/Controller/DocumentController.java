// package claimservice.Controller;

// import claimservice.entity.Document;
// import claimservice.service.DocumentService;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.multipart.MultipartFile;

// import java.util.UUID;

// @RestController
// @RequestMapping("/documents")
// public class DocumentController {

//     private final DocumentService documentService;

//     public DocumentController(DocumentService documentService) {
//         this.documentService = documentService;
//     }

//     @PostMapping("/{claimId}/upload")
//     public Document upload(
//             @PathVariable UUID claimId,
//             @RequestParam MultipartFile file
//     ) {
//         return documentService.uploadDocument(claimId, file);
//     }
// } 
