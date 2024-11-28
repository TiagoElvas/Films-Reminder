package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String director;
    private int  year;

    //private String type;
    //private String catchPhrase;


    public Film(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public Film() {
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYearReleased(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Title: " + title + "; " +
                "Director: " + director + "; " +
                "releasedDate: " + year;
    }
}
