package org.example;

import org.academiadecodigo.bootcamp.Prompt;
import org.example.controllers.VideoClubController;
import org.example.films.Cars;
import org.example.films.EveryFilm;
import org.example.films.Nemo;
import org.example.views.VideoClubView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("myFilmsWithSpring/src/main/resources/META-INF/spring-config.xml");
        VideoClubController vcc = context.getBean("videoClubController", VideoClubController.class);
        vcc.start();
    }
}