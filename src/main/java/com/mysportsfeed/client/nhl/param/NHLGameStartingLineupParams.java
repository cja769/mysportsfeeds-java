package com.mysportsfeed.client.nhl.param;

import com.mysportsfeed.client.common.param.CommonSeasonParams;
import com.mysportsfeed.type.LineupType;
import com.mysportsfeed.type.SortType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class NHLGameStartingLineupParams extends CommonSeasonParams {
    private String gameId;
    private List<String> positions;
    private List<LineupType> lineupTypes;

    public String buildUrlString(String baseUrl, String apiSlug) {
        StringBuilder sb = new StringBuilder(super.buildUrlString(baseUrl, apiSlug));
        if (sb.indexOf("?") == -1) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        addParameter("gameid", sb, getGameId());
        addParameter("position", sb, getPositions());
        addParameter("lineuptype", sb, getLineupTypes());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
