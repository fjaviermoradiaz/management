package com.es.enterprise.management.repository;

import com.es.enterprise.management.domain.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fjmora on 19/04/16.
 */
public interface ProjectRepository extends CrudRepository<Project,Long> {
}
