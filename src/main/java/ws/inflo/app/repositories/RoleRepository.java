package ws.inflo.app.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ws.inflo.app.models.Role;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
    @Query("Select * from roles where uid = :userId")
    List<Role> findByUserId(@Param("userId") Integer uid);
}
