package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.example.controller.filmController;

public class DeleteView {
    private Prompt prompt;
    private filmController filmController;

    public void show() {

        IntegerInputScanner input = new IntegerInputScanner();
        input.setMessage("Which film to delete? Type the number \n");
        Integer titleDelete = prompt.getUserInput(input);

        filmController.setDelete(titleDelete);
    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    public void setVideoClubController(filmController filmController) {
        this.filmController = filmController;
    }
}
