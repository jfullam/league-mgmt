package org.jfullam.domain.repository;

import org.jfullam.domain.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jfullam on 9/4/16.
 */
public interface EventRepository extends CrudRepository<Event, Long> {


}
