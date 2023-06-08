package com.mysportsfeed.client.nhl.param;

import com.mysportsfeed.client.common.param.CommonParams;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class NHLCurrentSeasonParams extends CommonParams {
    private String date;

    @Override
    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("fordate", sb, getDate());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
