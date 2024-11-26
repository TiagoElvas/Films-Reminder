package org.example.controllers;

import org.example.services.VideoClubService;
import org.example.views.VideoClubView;

public class VideoClubController {

    private VideoClubView videoClubView;
    private VideoClubService videoClubService;
    private int choice;

    public void start(){
        videoClubView.show();
        videoClubService.readListFilms(choice);

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
