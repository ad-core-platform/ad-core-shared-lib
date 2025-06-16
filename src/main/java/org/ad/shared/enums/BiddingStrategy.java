package org.ad.shared.enums;
import lombok.Getter;
@Getter
public enum BiddingStrategy {
    CPC("Cost Per Click"),
    CPM("Cost Per Mille"),
    CPA("Cost Per Acquisition");

    private final String description;

    BiddingStrategy(String description) {
        this.description = description;
    }
}
