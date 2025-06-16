package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum FallbackStage {

    STAGE_PRECISE(1, "Precise Targeting", "Demographics + Behavioral signals"),
    STAGE_DEMOGRAPHIC(2, "Demographic Only", "Demographics only"),
    STAGE_CONTEXTUAL(3, "Contextual/Default", "Position-based default ads");

    private final int stageNumber;
    private final String stageName;
    private final String description;

    FallbackStage(int stageNumber, String stageName, String description) {
        this.stageNumber = stageNumber;
        this.stageName = stageName;
        this.description = description;
    }

    public FallbackStage getNextStage() {
        switch (this) {
            case STAGE_PRECISE:
                return STAGE_DEMOGRAPHIC;
            case STAGE_DEMOGRAPHIC:
                return STAGE_CONTEXTUAL;
            case STAGE_CONTEXTUAL:
                return null; // 마지막 단계
            default:
                return null;
        }
    }

}
