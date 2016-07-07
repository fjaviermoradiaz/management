package com.es.enterprise.management.repository;

import com.es.enterprise.management.domain.NoteGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteGroupRepository extends CrudRepository<NoteGroup,Long> {

}
