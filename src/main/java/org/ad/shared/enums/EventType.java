package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum EventType {

    IMPRESSION("Advertisement Impression"),
    CLICK("Advertisement Click"),
    CONVERSION("Advertisement Conversion");

    private final String description;

    EventType(String description) {
        this.description = description;
    }
}
