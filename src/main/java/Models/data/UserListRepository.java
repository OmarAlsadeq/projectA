package Models.data;

import Models.User;
import Models.UserList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserListRepository extends CrudRepository<UserList, Integer> {


    static void save(User newUser) {
    }
}
