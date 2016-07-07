package com.es.enterprise.management.repository;

import com.es.enterprise.management.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {

}
