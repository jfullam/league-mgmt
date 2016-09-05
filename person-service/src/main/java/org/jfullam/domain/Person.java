package org.jfullam.domain;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by jfullam on 9/4/16.
 */

@Entity
public @Data class Person {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String lastName;
    @Column
    private String firstName;
    @Column
    private Date dob;
    @ManyToMany(mappedBy="members",fetch=FetchType.EAGER)
    private List<Team> teams;



}
