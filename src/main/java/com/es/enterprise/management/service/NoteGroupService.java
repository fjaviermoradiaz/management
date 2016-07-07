package com.es.enterprise.management.service;

import com.es.enterprise.management.domain.Category;
import com.es.enterprise.management.domain.NoteGroup;
import com.es.enterprise.management.repository.CategoryRepository;
import com.es.enterprise.management.repository.NoteGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoteGroupService {

    @Autowired
    private NoteGroupRepository noteGroupRepository;

    public Object findAll(){
        return noteGroupRepository.findAll();
    }

    public NoteGroup findById(Long id){
        return noteGroupRepository.findOne(id);
    }

    public NoteGroup save(NoteGroup noteGroup){
        return noteGroupRepository.save(noteGroup);
    }
}
