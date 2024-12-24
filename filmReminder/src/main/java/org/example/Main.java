package org.example;

import org.example.controller.filmController;

public class Main {
    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap();
        filmController filmController = bootstrap.wireObjects();

        filmController.start();
    }
}