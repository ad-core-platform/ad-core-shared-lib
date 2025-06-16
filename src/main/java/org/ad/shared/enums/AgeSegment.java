package org.ad.shared.enums;
import lombok.Getter;

@Getter
public enum AgeSegment {
    AGE_18_24("Young Adults", 18, 24),
    AGE_25_34("Young Professionals", 25, 34),
    AGE_35_44("Established Adults", 35, 44),
    AGE_45_PLUS("Mature Adults", 45, 120);

    private final String description;
    private final int minAge;
    private final int maxAge;

    AgeSegment(String description, int minAge, int maxAge) {
        this.description = description;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public static AgeSegment fromAge(int age) {
        for (AgeSegment segment : values()) {
            if (age >= segment.minAge && age <= segment.maxAge) {
                return segment;
            }
        }
        throw new IllegalArgumentException("Invalid age: " + age);
    }

    public String getCompositeKey() {
        return this.name();
    }
}
