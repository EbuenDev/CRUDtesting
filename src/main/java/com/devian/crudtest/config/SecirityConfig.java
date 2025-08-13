package com.devian.crudtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecirityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .formLogin(httpForm -> {
                    httpForm.loginPage("/login").permitAll();
                })

                .authorizeHttpRequests(registry -> {
                    registry.requestMatchers("req/signup").permitAll();
                    registry.anyRequest().authenticated();
                })
                .build();
    }

}
