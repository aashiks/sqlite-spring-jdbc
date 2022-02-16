package ws.inflo.app.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@Setter
@Getter
public class User {
    @Id
    Integer uid; //UUID
    String username;
    String emailAddress;
    String password;
    String creationDate = String.valueOf(System.currentTimeMillis());
    short enabled;

    public boolean getEnabled() {
        return enabled != 0;
    }

}
