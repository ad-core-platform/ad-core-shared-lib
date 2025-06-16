package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum GeographySegment {
    URBAN("Urban Areas"),
    SUBURBAN("Suburban Areas"),
    RURAL("Rural Areas");

    private final String description;

    GeographySegment(String description) {
        this.description = description;
    }

    public String getCompositeKey() {
        return this.name();
    }
}
