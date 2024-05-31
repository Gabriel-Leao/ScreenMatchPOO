package br.com.leao.screenmatch.models;

public class Movie extends Production {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() +  " (" + this.getReleaseYear() + ")";
    }
}
