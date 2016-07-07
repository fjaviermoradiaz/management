package com.es.enterprise.management.service;

import com.es.enterprise.management.domain.Note;
import com.es.enterprise.management.domain.NoteGroup;
import com.es.enterprise.management.repository.NoteGroupRepository;
import com.es.enterprise.management.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Object findAll(){
        return noteRepository.findAll();
    }

    public Note findById(Long id){
        return noteRepository.findOne(id);
    }

    public Note save(Note note){
        return noteRepository.save(note);
    }
}
