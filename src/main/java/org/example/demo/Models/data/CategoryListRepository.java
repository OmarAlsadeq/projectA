package org.example.demo.Models.data;

import jdk.jfr.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;


@Repository
public interface CategoryListRepository extends CrudRepository<Category, Integer> {
    // these things extend the CrudRepository built in thing.

}

