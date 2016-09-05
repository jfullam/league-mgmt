package org.jfullam.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jfullam on 9/5/16.
 */
@Entity
public @Data class Location {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zip;
    @Column
    private String description;
}
