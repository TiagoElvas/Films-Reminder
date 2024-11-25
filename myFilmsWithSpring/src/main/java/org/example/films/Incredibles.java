package org.example.films;

public class Incredibles extends EveryFilm {

    public Incredibles() {
        super("The Incredibles", "Brad Bird", 2004, "animation");
    }

    @Override
    public void catchPhrase() {
        System.out.println("You choose " + super.getName() + " for this afternoon! Enjoy it!");
        System.out.println("The baby is the worst!");
    }
}
