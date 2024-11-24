package org.example.films;

public class LionKing extends EveryFilm{

    public LionKing(String name, String director, int yearReleased, String type) {
        super("Lion King", "Chris Sanders", 1994, "animation");
    }

    @Override
    public void catchPhrase() {
        System.out.println("Wimba uéé, wimba uéé");
    }
}
