package org.jfullam.repository;

import org.jfullam.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by jfullam on 9/4/16.
 */
public interface TeamRepository extends CrudRepository<Team, Long> {


}
