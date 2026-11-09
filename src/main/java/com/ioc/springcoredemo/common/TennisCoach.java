package com.ioc.springcoredemo.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy 
@Component
@Primary
public class TennisCoach implements Coach {

    public TennisCoach() {
      System.out.println(">> Constructeur : " + getClass().getSimpleName());
} 

  @Override 
    public String getDailyWorkout() { 
      return "Practice your backhand volley";
    }
}