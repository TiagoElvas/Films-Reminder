package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.example.controller.filmController;

public class MenuView {


    private Prompt prompt;
    private filmController filmController;

    String[] options = {"List films", "Add film", "Delete film", "Exit"};

    public void show(){
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("Welcome to Codeflix");
        int choice = prompt.getUserInput(menuInputScanner);
        System.out.println(choice);
        filmController.setChoice(choice);
    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    public void setVideoClubController(filmController filmController) {
        this.filmController = filmController;
    }

}
