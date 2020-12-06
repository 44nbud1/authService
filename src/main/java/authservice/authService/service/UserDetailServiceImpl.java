package authservice.authService.service;

import authservice.authService.model.User;
import authservice.authService.repository.mapper.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        try {
            User user = userService.findByUsername(username);
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found , {} "+ e.getMessage()) ;
        }
        return null;
    }
}
