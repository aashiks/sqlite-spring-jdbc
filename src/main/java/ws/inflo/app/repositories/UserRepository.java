package ws.inflo.app.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ws.inflo.app.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    @Query("Select * from users where username = :userName")
    Optional<User> findByName(@Param("userName") String userName);

}
