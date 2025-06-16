package org.ad.shared.enums;

public enum BehavioralSignalType {

    PURCHASE_INTENT("Purchase Intent"),
    ENGAGEMENT_BEHAVIOR("Engagement Behavior"),
    DEVICE_PREFERENCE("Device Preference");

    private final String description;

    BehavioralSignalType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
