package authservice.authService.repository.mapper;

import authservice.authService.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (user_id, name,email,password, role_id, username) " +
            "VALUES (#{userId},#{name},#{email},#{password},#{roleId},#{username},)")
    public int saveUser(User user);

    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByUsername(String username);
}


/**    private String username;
 private String password;
 private String name;
 private String email;
 private String user_id;
 private Set<Role> role_id;
 */