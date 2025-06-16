package org.ad.shared.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ad.shared.enums.EventType;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private String eventId;
    private EventType eventType;
    private Long userId;
    private Long campaignId;
    private Long creativeId;
    private String requestId;
    private LocalDateTime timestamp;
    private String userAgent;
    private String clientIp;
}
