package org.ad.shared.enums;
import lombok.Getter;
@Getter
public enum IncomeSegment {
    LOW("Low Income", 0, 50000),
    MID("Middle Income", 50001, 100000),
    HIGH("High Income", 100001, Integer.MAX_VALUE);

    private final String description;
    private final int minIncome;
    private final int maxIncome;

    IncomeSegment(String description, int minIncome, int maxIncome) {
        this.description = description;
        this.minIncome = minIncome;
        this.maxIncome = maxIncome;
    }

    public static IncomeSegment fromIncome(int income) {
        for (IncomeSegment segment : values()) {
            if (income >= segment.minIncome && income <= segment.maxIncome) {
                return segment;
            }
        }
        throw new IllegalArgumentException("Invalid income: " + income);
    }

    public String getCompositeKey() {
        return this.name();
    }
}
