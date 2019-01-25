package cn.jsbintask.springbootoauth2learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringbootOauth2LearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOauth2LearningApplication.class, args);
    }

}

