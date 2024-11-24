package org.example.films;

public class EveryFilm implements Film{

    private String name;
    private String director;
    private int yearReleased;
    private String type;


    public EveryFilm(String name, String director, int yearReleased, String type){
        this.name = name;
        this.director = director;
        this.yearReleased = yearReleased;
        this.type = type;
        System.out.println("Your choose " + name + " for this afternoon! Enjoy it!");
    }

    @Override
    public void catchPhrase(){};
}
