package org.example.controller;

import org.example.model.Film;
import org.example.services.filmService;
import org.example.views.AddFilmView;
import org.example.views.DeleteView;
import org.example.views.MenuView;

import java.util.List;

public class filmController {

    private MenuView menuView;
    private filmService filmService;
    private AddFilmView addFilmView;
    private DeleteView deleteView;
    private int choice;
    private Film newFilm;
    private int filmDeleted;


    public void start() {
        menuView.show();

        switch (choice) {
            case 1:
                List<Film> films = filmService.readListFilms();
                for (Film list : films) {
                    System.out.println(list.toString());
                }
                break;
            case 2:
                addFilmView.show();
                filmService.addFilm(newFilm);
                break;
            case 3:
                deleteView.show();
                filmService.delete(filmDeleted);
                break;
            case 4:
                System.out.println("Come again to CodeFlix!");
                return;
        }

        start();
    }

    //getters and setters

    public void setVideoClubView(MenuView menuView) {
        this.menuView = menuView;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setVideoClubService(filmService filmService) {
        this.filmService = filmService;
    }

    public void setAddFilmView(AddFilmView addFilmView) {
        this.addFilmView = addFilmView;
    }

    public void setNewFilm(Film newFilm) {
        this.newFilm = newFilm;
    }

    public void setDelete(int delete) {
        this.filmDeleted = delete;
    }

    public void setDeleteView(DeleteView deleteView) {
        this.deleteView = deleteView;
    }
}
