package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum DevicePreference {
    MOBILE_FIRST("Mobile First", "Primary mobile device usage"),
    DESKTOP_PREFERRED("Desktop Preferred", "Primary desktop usage"),
    MULTI_DEVICE("Multi-Device", "Cross-device usage patterns"),
    TABLET_FOCUSED("Tablet Focused", "Primary tablet usage");

    private final String preference;
    private final String description;

    DevicePreference(String preference, String description) {
        this.preference = preference;
        this.description = description;
    }
}
