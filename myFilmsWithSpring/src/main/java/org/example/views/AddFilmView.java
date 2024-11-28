package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.example.controllers.VideoClubController;

public class AddFilmView {

    private Prompt prompt;
    private VideoClubController videoClubController;

    public void show(){
        StringInputScanner input = new StringInputScanner();
        input.setMessage("Add a new film!");
        prompt.getUserInput(input);
    }

}
