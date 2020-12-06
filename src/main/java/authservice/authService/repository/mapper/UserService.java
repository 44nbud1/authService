package authservice.authService.repository.mapper;

import authservice.authService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
