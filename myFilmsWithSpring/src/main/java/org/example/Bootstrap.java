package org.example;

import org.academiadecodigo.bootcamp.Prompt;
import org.example.controllers.VideoClubController;
import org.example.services.VideoClubService;
import org.example.views.VideoClubView;

public class Bootstrap {


    public VideoClubController wireObjects() {
        Prompt prompt = new Prompt(System.in, System.out);

        VideoClubController videoClubController = new VideoClubController();

        VideoClubView videoClubView = new VideoClubView();
        VideoClubService videoClubService = new VideoClubService();

        videoClubView.setVideoClubController(videoClubController);

        videoClubController.setVideoClubService(videoClubService);
        videoClubController.setVideoClubView(videoClubView);

        videoClubView.setPrompt(prompt);


        return videoClubController;
    }

}