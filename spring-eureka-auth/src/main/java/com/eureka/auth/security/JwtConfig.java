package com.eureka.auth.security;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.ToString;


@Getter 		// lombok will create getters auto.
@ToString		// [IMP] You need to install lombok jar file: https://stackoverflow.com/a/11807022
public class JwtConfig {

    // Spring doesn't inject/autowire to "static" fields.
    @Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;

}
