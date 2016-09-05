package org.jfullam.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jfullam on 9/4/16.
 */
@Entity
public @Data class Event {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private Date date;
    @Embedded
    @AttributeOverrides( {
            @AttributeOverride(name="id", column = @Column(name="home_competitor_id") ),
            @AttributeOverride(name="name", column = @Column(name="home_competitor_name") ) })
    private Competitor homeCompetitor;

    @Embedded
    @AttributeOverrides( {
            @AttributeOverride(name="id", column = @Column(name="visiting_competitor_id") ),
            @AttributeOverride(name="name", column = @Column(name="visiting_competitor_name") ) })
    private Competitor visitingCompetitor;


}
