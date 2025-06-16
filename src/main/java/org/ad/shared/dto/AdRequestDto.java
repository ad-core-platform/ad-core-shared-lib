package org.ad.shared.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ad.shared.enums.AdPosition;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdRequestDto {
    private Long userId;
    private AdPosition position;
    private String deviceType; // mobile, desktop
    private String userAgent;
    private String clientIp;
    private Integer requestedSlots;
}
