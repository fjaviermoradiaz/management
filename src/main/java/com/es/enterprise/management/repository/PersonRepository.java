package com.es.enterprise.management.repository;

import com.es.enterprise.management.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
