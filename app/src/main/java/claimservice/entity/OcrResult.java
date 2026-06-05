package claimservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ocr_results")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OcrResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long claimId;

    private Long documentId;

    @Column(length = 5000)
    private String extractedText;

    private Double confidence;
}