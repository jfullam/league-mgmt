package org.jfullam.domain;

import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by jfullam on 9/5/16.
 */
@Data
public class StatisticCollection {

    @NonNull
    private String entity;
    private List<Statistic> statistics;
    @Value("stats.collection.description")
    private String description;

}
