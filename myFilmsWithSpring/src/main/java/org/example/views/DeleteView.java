package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.example.controllers.VideoClubController;
import org.example.model.Film;

public class DeleteView {
    private Prompt prompt;
    private VideoClubController videoClubController;

    public void show() {


        IntegerInputScanner input = new IntegerInputScanner();
        input.setMessage("Which film to delete? Write the title: \n");
        Integer titleDelete = prompt.getUserInput(input);

        videoClubController.setDelete(titleDelete);
    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    public void setVideoClubController(VideoClubController videoClubController) {
        this.videoClubController = videoClubController;
    }
}
