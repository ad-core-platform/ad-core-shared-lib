package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum EngagementBehavior {
    HIGH_FREQUENCY("High Frequency", "Daily active users"),
    MODERATE_FREQUENCY("Moderate Frequency", "Weekly active users"),
    LOW_FREQUENCY("Low Frequency", "Monthly active users"),
    RESEARCH_ORIENTED("Research Oriented", "In-depth content consumption"),
    IMPULSE_DRIVEN("Impulse Driven", "Quick decision-making patterns");

    private final String behavior;
    private final String description;

    EngagementBehavior(String behavior, String description) {
        this.behavior = behavior;
        this.description = description;
    }
}
