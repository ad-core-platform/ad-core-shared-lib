package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum PurchaseIntent {
    AUTOMOTIVE("Automotive", "Car research and purchasing signals"),
    FINANCE("Financial Services", "Banking, investment, insurance interests"),
    TRAVEL("Travel & Tourism", "Trip planning and booking behaviors"),
    RETAIL("Retail & E-commerce", "Online shopping patterns"),
    TECHNOLOGY("Technology", "Tech product research and adoption"),
    HEALTHCARE("Healthcare", "Health and wellness interests"),
    REAL_ESTATE("Real Estate", "Property search and investment");

    private final String category;
    private final String description;

    PurchaseIntent(String category, String description) {
        this.category = category;
        this.description = description;
    }
}
