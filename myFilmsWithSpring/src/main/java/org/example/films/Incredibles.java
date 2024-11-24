package org.example.films;

public class Incredibles extends EveryFilm {

    public Incredibles(String name, String director, int yearReleased, String type) {
        super("The Incredibles", "Brad Bird", 2004, "animation");
    }

    @Override
    public void catchPhrase() {
        System.out.println("The baby is the worst!");
    }
}
