package org.jfullam.domain;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

/**
 * Created by jfullam on 9/5/16.
 */
@Data
public class StatisticCollection {

    @NonNull
    private String entity;
    private List<Statistic> statistics;
    @NonNull
    private String description;

}
