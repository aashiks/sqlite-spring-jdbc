package ws.inflo.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ws.inflo.app.models.Role;
import ws.inflo.app.models.User;
import ws.inflo.app.repositories.RoleRepository;
import ws.inflo.app.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public Optional<User> findUserByName(String name) {
        return userRepository.findByName(name);
    }

    public List<Role> findRolesForUser(User user) {
        return findRolesForUserId(user.getUid());
    }


    public List<Role> findRolesForUserId(Integer userId) {
        return roleRepository.findByUserId(userId);
    }

    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
