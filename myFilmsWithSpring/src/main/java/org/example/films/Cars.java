package org.example.films;

public class Cars extends EveryFilm {

    public Cars(){
        super("Cars", "John Lasseter", 2006, "animation");
    }

    @Override
    public void catchPhrase() {
        System.out.println("Ka-chow!!");
    }
}
