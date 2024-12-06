package org.example;

import org.example.controllers.VideoClubController;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class Main {
    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap();
        VideoClubController videoClubController = bootstrap.wireObjects();

        videoClubController.start();
    }
}