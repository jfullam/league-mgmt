package org.jfullam.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by jfullam on 9/5/16.
 */

@Entity
@Data
public class EventLocation implements Serializable {

    @Id
    private Long eventId;
    @Id
    private Long locationId;
}
