package org.example.demo.Models.data;

import org.example.demo.Models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleListRepository extends CrudRepository <Role, Integer> {
    // these things extend the CrudRepository built in thing.

}