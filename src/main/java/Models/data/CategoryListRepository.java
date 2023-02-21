package Models.data;


import Controllers.CategoryListController;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryListRepository {

    static Object findAll() {
        return null;
    }
    // these things extend the CrudRepository built in thing.

}

