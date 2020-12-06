package authservice.authService.model;

import java.util.Set;

public class User {

    private String username;
    private String password;
    private String name;
    private String email;
    private String user_id;
    private Set<Role> role_id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Set<Role> getRole_id() {
        return role_id;
    }

    public void setRole_id(Set<Role> role_id) {
        this.role_id = role_id;
    }
}
