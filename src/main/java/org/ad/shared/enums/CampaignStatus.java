package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum CampaignStatus {
    DRAFT("Draft"),
    ACTIVE("Active"),
    PAUSED("Paused"),
    COMPLETED("Completed");

    private final String description;

    CampaignStatus(String description) {
        this.description = description;
    }

    public boolean canActivate() {
        return this == DRAFT || this == PAUSED;
    }

    public boolean canPause() {
        return this == ACTIVE;
    }
}
