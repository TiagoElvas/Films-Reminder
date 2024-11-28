package org.example;

import org.academiadecodigo.bootcamp.Prompt;
import org.example.JPAConnectionManager.JPASessionManager;
import org.example.JPAConnectionManager.JPATransactionManager;
import org.example.controllers.VideoClubController;
import org.example.dao.Dao;
import org.example.services.VideoClubService;
import org.example.views.VideoClubView;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {


    public VideoClubController wireObjects() {
        Prompt prompt = new Prompt(System.in, System.out);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        Dao dao = new Dao();
        JPASessionManager jpaSessionManager = new JPASessionManager();
        JPATransactionManager jpaTransactionManager = new JPATransactionManager();

        VideoClubController videoClubController = new VideoClubController();

        VideoClubView videoClubView = new VideoClubView();

        VideoClubService videoClubService = new VideoClubService();
        videoClubService.setDao(dao);

        videoClubView.setVideoClubController(videoClubController);

        videoClubController.setVideoClubService(videoClubService);
        videoClubController.setVideoClubView(videoClubView);

        videoClubView.setPrompt(prompt);

        dao.setEntityManagerFactory(emf);
        jpaSessionManager.setEntityManagerFactory(emf);
        jpaTransactionManager.setJPASessionManager(jpaSessionManager);
        videoClubService.setTm(jpaTransactionManager);


        return videoClubController;
    }

}