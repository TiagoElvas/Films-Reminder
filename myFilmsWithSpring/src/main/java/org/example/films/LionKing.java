package org.example.films;

public class LionKing extends EveryFilm{

    public LionKing() {
        super("Lion King", "Chris Sanders", 1994, "animation");
    }

    @Override
    public void catchPhrase() {
        System.out.println("You choose " + super.getName() + " for this afternoon! Enjoy it!");
        System.out.println("Wimba uéé, wimba uéé");
    }
}
