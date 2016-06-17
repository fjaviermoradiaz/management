package com.es.enterprise.management.service.impl;

import com.es.enterprise.management.domain.Project;
import com.es.enterprise.management.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fjmora on 19/04/16.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Object findAll() { return projectRepository.findAll(); }

    public Project findById(Long id){
        return projectRepository.findOne(id);
    }

    public Project save(Project person){
        return projectRepository.save(person);
    }
}
