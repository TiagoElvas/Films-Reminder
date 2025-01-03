package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.example.controller.filmController;
import org.example.model.Film;

public class AddFilmView {

    private Prompt prompt;
    private filmController filmController;

    public void show(){

        StringInputScanner input = new StringInputScanner();
        input.setMessage("Add a new film! \n");
        String title = prompt.getUserInput(input);

        input.setMessage("director: \n");
        String director = prompt.getUserInput(input);

        IntegerInputScanner input1 = new IntegerInputScanner();
        input1.setMessage("date of released: \n");
        int year = prompt.getUserInput(input1);


        Film newFilm = new Film(title, director, year);
        filmController.setNewFilm(newFilm);
    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    public void setVideoClubController(filmController filmController) {
        this.filmController = filmController;
    }
}
