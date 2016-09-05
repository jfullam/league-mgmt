package org.jfullam.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * Created by jfullam on 9/4/16.
 */
@Embeddable
public @Data class Competitor {

    private Long id;
    private String name;

}
