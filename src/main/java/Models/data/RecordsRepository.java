package Models.data;

import Models.RecordsList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsRepository extends CrudRepository<RecordsList, Integer> {

}
