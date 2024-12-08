package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.example.Bootstrap;
import org.example.controllers.VideoClubController;

public class VideoClubView {


    private Prompt prompt;
    private VideoClubController videoClubController;

    String[] options = {"List films", "Add film", "Delete film", "Exit"};

    public void show(){
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("Welcome to Codeflix");
        int choice = prompt.getUserInput(menuInputScanner);
        System.out.println(choice);
        videoClubController.setChoice(choice);
    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    public void setVideoClubController(VideoClubController videoClubController) {
        this.videoClubController = videoClubController;
    }

}
