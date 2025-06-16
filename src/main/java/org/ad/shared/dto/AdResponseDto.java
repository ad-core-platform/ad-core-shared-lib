package org.ad.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ad.shared.enums.FallbackStage;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdResponseDto {

    private String requestId;
    private List<AdCreativeDto> ads;
    private FallbackStage usedStage;
    private String targetingCriteria;
    private Long processingTimeMs;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AdCreativeDto {
        private Long campaignId;
        private Long creativeId;
        private String title;
        private String description;
        private String imageUrl;
        private String clickUrl;
        private BigDecimal bidAmount;
        private String trackingPixel;
    }
}
