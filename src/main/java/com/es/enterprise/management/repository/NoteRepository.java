package com.es.enterprise.management.repository;

import com.es.enterprise.management.domain.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends CrudRepository<Note,Long> {

}
