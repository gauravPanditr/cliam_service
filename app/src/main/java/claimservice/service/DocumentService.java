package claimservice.service;

import claimservice.entity.Document;
import claimservice.repository.DocumentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class DocumentService {

    private final CloudinaryService cloudinaryService;
    private final DocumentRepository documentRepository;

    public DocumentService(CloudinaryService cloudinaryService,
                           DocumentRepository documentRepository) {
        this.cloudinaryService = cloudinaryService;
        this.documentRepository = documentRepository;
    }

    public Document uploadDocument(UUID claimId, MultipartFile file) {

        // 1. Upload to Cloudinary
        String url = cloudinaryService.uploadFile(file);

        // 2. Save DB
        Document docs = Document.builder()
                .claimId(claimId)
                .fileName(file.getOriginalFilename())
                .fileUrl(url)
                .fileType(file.getContentType())
                .fileSizeKb(file.getSize() / 1024)
                .build();

        return documentRepository.save(docs);
    }
}