package com.mysportsfeed.client.common.param;

import com.mysportsfeed.type.SeasonType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class CommonSeasonParams extends CommonParams {
    private SeasonType seasonType;
    private Integer startYear;
    private Integer endYear;

    public String buildUrlString(String baseUrl, String apiSlug) {
        if (getSeasonType().isRequiresYear() && getStartYear() == null && getEndYear() == null) {
            throw new IllegalArgumentException("Season type " + getSeasonType().name() + " requires a year");
        }
        StringBuilder sb = new StringBuilder(baseUrl);
        sb.append(getSeasonType().buildKey(getStartYear(), getEndYear()));
        sb.append(apiSlug);
        return super.buildUrlString(sb.toString(), "");
    }

}
