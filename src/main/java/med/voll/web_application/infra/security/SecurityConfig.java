package med.voll.web_application.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService dadosUsuariosCadastrados() {
        UserDetails user = User.builder()
                .username("alice@email.com")
                .password("{noop}alice123")
                .build();
        UserDetails user2 = User.builder()
                .username("matheus@email.com")
                .password("{noop}matheus123")
                .build();
        return new InMemoryUserDetailsManager(user, user2);
    }

}
