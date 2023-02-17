package Models.data;

import Models.UserList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserListRepository extends CrudRepository<UserList, Integer> {


}
