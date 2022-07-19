package com.zcz.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;*/

/**
 * 如果eureka服务器添加了spring security的权限认证，则必须将csrf关闭，不然无法将服务注册进eureka
 */
//@Configuration
//@EnableWebSecurity
public class WebSecurityConfig {

    /*@Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //关闭csrf跨站攻击
        return http.csrf().disable().build();
    }*/
}
