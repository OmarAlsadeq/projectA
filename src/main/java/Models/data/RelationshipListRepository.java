package Models.data;


import Models.Relationship;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationshipListRepository extends CrudRepository <Relationship, Integer> {
    // these things extend the CrudRepository built in thing.

}
