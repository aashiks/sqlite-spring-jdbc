package ws.inflo.app.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ws.inflo.app.models.Role;
import ws.inflo.app.models.User;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
public class UserRepoTest {
    private static final Logger logger = LoggerFactory.getLogger(UserRepoTest.class);
    @Autowired
    UserService userService;

    @Test
    void should_GetUser() {
        Optional<User> userOptional = userService.findUserByName("user");
        assertTrue(userOptional.isPresent());
        User user = userOptional.get();
    }

    @Test
    void should_GetUserRoles() {
        Optional<User> userOptional = userService.findUserByName("user");
        assertTrue(userOptional.isPresent());
        User user = userOptional.get();
        List<Role> roleList = userService.findRolesForUser(user);
        assertTrue(roleList.size() > 0);
    }

    @Test
    void should_CreateUser() {
        User u = new User();
        u.setPassword("Test");
        u.setEnabled((short) 0);
        u.setUsername("test-user-name");
        u.setEmailAddress("test-me@example.com");
        User user = userService.createUser(u);
        assertNotNull(user);
        logger.info(String.valueOf(user.getUid()));
    }
}
