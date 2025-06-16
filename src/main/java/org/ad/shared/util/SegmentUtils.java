package org.ad.shared.util;

import org.ad.shared.enums.AgeSegment;
import org.ad.shared.enums.GeographySegment;
import org.ad.shared.enums.IncomeSegment;

public class SegmentUtils {

    /**
     * MECE 복합 세그먼트 생성
     */
    public static String createDemographicSegment(AgeSegment age, IncomeSegment income, GeographySegment geography) {
        return String.format("%s_%s_%s",
                age.getCompositeKey(),
                income.getCompositeKey(),
                geography.getCompositeKey());
    }

    /**
     * 복합 세그먼트에서 개별 세그먼트 추출
     */
    public static String[] parseDemographicSegment(String compositeSegment) {
        return compositeSegment.split("_");
    }

    /**
     * 연령으로부터 자동 세그먼트 분류
     */
    public static AgeSegment classifyAge(int age) {
        return AgeSegment.fromAge(age);
    }

    /**
     * 소득으로부터 자동 세그먼트 분류
     */
    public static IncomeSegment classifyIncome(int income) {
        return IncomeSegment.fromIncome(income);
    }

    /**
     * 지역 코드로부터 Geography 분류 (임시 로직)
     */
    public static GeographySegment classifyGeography(String postalCode) {
        // 실제로는 우편번호 DB 매핑이 필요하지만, MVP에서는 단순화
        if (postalCode.startsWith("0") || postalCode.startsWith("1")) {
            return GeographySegment.URBAN;
        } else if (postalCode.startsWith("2") || postalCode.startsWith("3")) {
            return GeographySegment.SUBURBAN;
        } else {
            return GeographySegment.RURAL;
        }
    }
}
