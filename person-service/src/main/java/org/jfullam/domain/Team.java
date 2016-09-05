package org.jfullam.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jfullam on 9/4/16.
 */

@Entity
public @Data class Team {

    @Id
    @GeneratedValue
    Long id;
    @Column
    String name;
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "teamMembers", joinColumns = @JoinColumn(name="teamId",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "personId", referencedColumnName = "id"))
    private List<Person> members;





}
