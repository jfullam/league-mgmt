package org.jfullam.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by jfullam on 9/4/16.
 */
@Entity
public @Data
class TeamMembers implements Serializable{

    @Id
    Long teamId;
    @Id
    Long personId;
}
