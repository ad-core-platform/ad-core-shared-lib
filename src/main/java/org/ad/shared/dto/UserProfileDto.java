package org.ad.shared.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ad.shared.enums.*;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDto {

    private Long userId;
    private AgeSegment ageSegment;
    private IncomeSegment incomeSegment;
    private GeographySegment geographySegment;
    private Set<PurchaseIntent> purchaseIntents;
    private Set<EngagementBehavior> engagementBehaviors;
    private Set<DevicePreference> devicePreferences;
    private LocalDateTime lastUpdated;

    // 복합 세그먼트 생성
    public String getDemographicSegment() {
        return String.format("%s_%s_%s",
                ageSegment.getCompositeKey(),
                incomeSegment.getCompositeKey(),
                geographySegment.getCompositeKey());
    }
}
