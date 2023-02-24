package org.example.demo.Models.data;

import org.example.demo.Models.RecordsList;
import org.example.demo.Models.User;
import org.example.demo.Models.UserList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    static Object getAll() {
        return null;
    }

    static void save(UserList newUser) {
    }

    static void save(RecordsList newRecord) {
    }

    static void add(User newUser) {
    }

    static void remove(int id) {
    }
}
