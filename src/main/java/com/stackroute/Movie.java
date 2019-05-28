package com.stackroute;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
  private   Actor actor;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }
@Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }



}
