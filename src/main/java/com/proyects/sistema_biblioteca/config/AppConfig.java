package com.proyects.sistema_biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.FilterChain;

@Configuration
// @EnableWebSecurity
public class AppConfig {
   /*  @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpS) throws Exception {
        return httpS
                .authorizeHttpRequests(auth -> auth.requestMatchers("/public/greeting").permitAll().anyRequest().authenticated())
                .csrf(param -> param.disable())
                .formLogin(form -> form.permitAll().successHandler(authenticationSuccessHandler()))
                .build();
    }
    public AuthenticationSuccessHandler authenticationSuccessHandler(){
        return ((request,response,authentication)-> {response.sendRedirect("/private/session");});
    }
        */
}
