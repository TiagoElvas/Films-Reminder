package org.example.controllers;

import com.mysql.cj.x.protobuf.Mysqlx;
import org.example.model.Film;
import org.example.services.VideoClubService;
import org.example.views.AddFilmView;
import org.example.views.DeleteView;
import org.example.views.VideoClubView;

import java.util.List;

public class VideoClubController {

    private VideoClubView videoClubView;
    private VideoClubService videoClubService;
    private AddFilmView addFilmView;
    private DeleteView deleteView;
    private int choice;
    private Film newFilm;
    private int filmDeleted;


    public void start() {
        videoClubView.show();

        switch (choice) {
            case 1:
                List<Film> films = videoClubService.readListFilms();
                for (Film list : films) {
                    System.out.println(list.toString());
                }
                break;
            case 2:
                addFilmView.show();
                videoClubService.addFilm(newFilm);
                break;
            case 3:
                deleteView.show();
                videoClubService.delete(filmDeleted);
                break;
            case 4:
                System.out.println("Come again to CodeFlix!");
                return;
        }

        start();
    }

    //getters and setters

    public void setVideoClubView(VideoClubView videoClubView) {
        this.videoClubView = videoClubView;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setVideoClubService(VideoClubService videoClubService) {
        this.videoClubService = videoClubService;
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
