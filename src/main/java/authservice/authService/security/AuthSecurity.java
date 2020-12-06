package authservice.authService.security;

import authservice.authService.util.jwt.JwtAuthEntryPoint;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
public class AuthSecurity extends WebSecurityConfigurerAdapter {

    JwtAuthEntryPoint jwtAuthEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.cors().and().csrf().disable()
               .exceptionHandling().authenticationEntryPoint(jwtAuthEntryPoint).and()
               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
               .authorizeRequests().antMatchers("").permitAll()
               .anyRequest().authenticated();
       http.addFilterBefore(, UsernamePasswordAuthenticationToken);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }
}
