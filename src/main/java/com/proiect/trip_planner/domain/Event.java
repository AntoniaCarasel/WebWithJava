package com.proiect.trip_planner.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Event {
    private String numeEveniment;
    private String descriereEveniment;
    private Date startEvent;
    private Date endEvent;
}
