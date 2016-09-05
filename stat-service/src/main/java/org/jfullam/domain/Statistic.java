package org.jfullam.domain;

import lombok.Data;
import lombok.NonNull;

/**
 * Created by jfullam on 9/5/16.
 */
@Data
public class Statistic {

    @NonNull
    private String name;
    @NonNull
    private Object value;


}
