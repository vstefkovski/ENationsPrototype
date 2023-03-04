package mk.ukim.finki.enationsprototype.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/h2**"); // do not remove this line

        // TODO: If you are implementing the security requirements, remove this following line
        web.ignoring().antMatchers("/**");

    }
}

