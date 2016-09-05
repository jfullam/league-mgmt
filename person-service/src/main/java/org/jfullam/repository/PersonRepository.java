package org.jfullam.repository;

import org.jfullam.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jfullam on 9/4/16.
 */

@RepositoryRestResource(path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByLastNameIgnoreCase(@Param("lastName") String lastName);

}
