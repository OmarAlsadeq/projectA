package org.example.demo.Models.data;


import org.springframework.stereotype.Repository;


@Repository
public interface CategoryListRepository {

    static Object findAll() {
        return null;
    }
    // these things extend the CrudRepository built in thing.

}
