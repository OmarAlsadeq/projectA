package Models.data;


import Models.CategoryData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryListRepository extends CrudRepository<CategoryData, Integer> {
}

    // these things extend the CrudRepository built in thing.



