package org.example.controllers;

import org.example.model.Film;
import org.example.services.VideoClubService;
import org.example.views.AddFilmView;
import org.example.views.VideoClubView;

import java.util.List;

public class VideoClubController {

    private VideoClubView videoClubView;
    private VideoClubService videoClubService;
    private AddFilmView addFilmView;
    private int choice;


    public void start(){
        videoClubView.show();

        switch(choice){
            case 1:
                List<Film> films = videoClubService.readListFilms();
                for (Film list : films) {
                    System.out.println(list.toString());
                }
               break;
            case 2:
                addFilmView.show();
        }
    }

    public void setVideoClubView(VideoClubView videoClubView) {
        this.videoClubView = videoClubView;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setVideoClubService(VideoClubService videoClubService) {
        this.videoClubService = videoClubService;
    }

}
