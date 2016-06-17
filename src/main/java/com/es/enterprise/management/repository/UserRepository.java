package com.es.enterprise.management.repository;

import com.es.enterprise.management.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fjmora on 17/06/16.
 */
public interface UserRepository extends CrudRepository<User,Long> {

    User findOneByEmail(String email);
}
