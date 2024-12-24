package org.example;

import org.academiadecodigo.bootcamp.Prompt;
import org.example.JPAConnectionManager.JPASessionManager;
import org.example.JPAConnectionManager.JPATransactionManager;
import org.example.controller.filmController;
import org.example.dao.Dao;
import org.example.services.filmService;
import org.example.views.AddFilmView;
import org.example.views.DeleteView;
import org.example.views.MenuView;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {


    public filmController wireObjects() {
        Prompt prompt = new Prompt(System.in, System.out);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        Dao dao = new Dao();
        dao.setEntityManagerFactory(emf);

        JPASessionManager jpaSessionManager = new JPASessionManager();
        jpaSessionManager.setEntityManagerFactory(emf);

        JPATransactionManager jpaTransactionManager = new JPATransactionManager();
        jpaTransactionManager.setJPASessionManager(jpaSessionManager);

        filmController filmController = new filmController();

        AddFilmView addFilmView = new AddFilmView();
        addFilmView.setPrompt(prompt);
        addFilmView.setVideoClubController(filmController);

        DeleteView deleteView = new DeleteView();
        deleteView.setPrompt(prompt);
        deleteView.setVideoClubController(filmController);

        MenuView menuView = new MenuView();
        menuView.setVideoClubController(filmController);
        menuView.setPrompt(prompt);

        filmService filmService = new filmService();
        filmService.setDao(dao);
        filmService.setTm(jpaTransactionManager);

        filmController.setVideoClubService(filmService);
        filmController.setVideoClubView(menuView);
        filmController.setAddFilmView(addFilmView);
        filmController.setDeleteView(deleteView);


        return filmController;
    }
}