package com.mysportsfeed.response.nhl.component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;

import java.util.Date;

@Data
public class NHLGame {

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    private String time;

    // TODO don't know structure
    private Object awayTeam;

    // TODO don't know structure
    private Object homeTeam;
}
