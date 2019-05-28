package com.stackroute;


import com.stackroute.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MainConfig.class);
        ctx.refresh();
        Movie movie = (Movie) ctx.getBean("movie");
        System.out.println(movie);

    }


}
