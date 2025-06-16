package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum AdPosition {
    MAIN_TOP("Main Top Banner", 1),
    MAIN_MIDDLE("Main Middle Section", 2),
    MAIN_BOTTOM("Main Bottom Banner", 1),
    MAIN_LEFT_SIDEBAR("Left Sidebar", 3),
    MAIN_RIGHT_SIDEBAR("Right Sidebar", 3);

    private final String displayName;
    private final int maxSlots;

    AdPosition(String displayName, int maxSlots) {
        this.displayName = displayName;
        this.maxSlots = maxSlots;
    }
}
