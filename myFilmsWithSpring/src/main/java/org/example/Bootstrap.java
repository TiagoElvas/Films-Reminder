package org.example;

import org.academiadecodigo.bootcamp.Prompt;
import org.example.JPAConnectionManager.JPASessionManager;
import org.example.JPAConnectionManager.JPATransactionManager;
import org.example.controllers.VideoClubController;
import org.example.dao.Dao;
import org.example.services.VideoClubService;
import org.example.views.AddFilmView;
import org.example.views.DeleteView;
import org.example.views.VideoClubView;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {


    public VideoClubController wireObjects() {
        Prompt prompt = new Prompt(System.in, System.out);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        Dao dao = new Dao();
        dao.setEntityManagerFactory(emf);

        JPASessionManager jpaSessionManager = new JPASessionManager();
        jpaSessionManager.setEntityManagerFactory(emf);

        JPATransactionManager jpaTransactionManager = new JPATransactionManager();
        jpaTransactionManager.setJPASessionManager(jpaSessionManager);

        VideoClubController videoClubController = new VideoClubController();

        AddFilmView addFilmView = new AddFilmView();
        addFilmView.setPrompt(prompt);
        addFilmView.setVideoClubController(videoClubController);

        DeleteView deleteView = new DeleteView();
        deleteView.setPrompt(prompt);
        deleteView.setVideoClubController(videoClubController);

        VideoClubView videoClubView = new VideoClubView();
        videoClubView.setVideoClubController(videoClubController);
        videoClubView.setPrompt(prompt);

        VideoClubService videoClubService = new VideoClubService();
        videoClubService.setDao(dao);
        videoClubService.setTm(jpaTransactionManager);

        videoClubController.setVideoClubService(videoClubService);
        videoClubController.setVideoClubView(videoClubView);
        videoClubController.setAddFilmView(addFilmView);
        videoClubController.setDeleteView(deleteView);


        return videoClubController;
    }
}