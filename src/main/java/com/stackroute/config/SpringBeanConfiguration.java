package com.stackroute.config;

import com.stackroute.Actor;
import com.stackroute.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {
    @Bean(name = "actor")
    public Actor getActor(){
        return new Actor("Vijay DevarKonda","male",27);
    }
    @Bean(name="movie")
    public Movie getMovie(){
        return new Movie();
    }
}

