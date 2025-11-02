package com.proyects.sistema_biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.FilterChain;

@Configuration
@EnableWebSecurity
public class AppConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpS) throws Exception {
        return httpS
                .authorizeHttpRequests(auth -> auth.requestMatchers("/public").permitAll().anyRequest().authenticated())
                .csrf(param -> param.disable()).build();
    }
}
