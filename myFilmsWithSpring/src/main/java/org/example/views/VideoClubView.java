package org.example.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class VideoClubView {


    Prompt prompt;

    String[] options = {"Cars", "Nemo", "Lion King", "The Incredibles"};

    public void Show(){
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("What would do you like to see?");
        int choice = prompt.getUserInput(menuInputScanner);
        System.out.println(choice);

    }

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }
}
