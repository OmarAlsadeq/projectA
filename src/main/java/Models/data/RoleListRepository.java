package Models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleListRepository extends CrudRepository <Role, Integer> {
    // these things extend the CrudRepository built in thing.

}