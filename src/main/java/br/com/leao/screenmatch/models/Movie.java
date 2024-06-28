package br.com.leao.screenmatch.models;

public class Movie extends Production {
    private String director;

    public Movie(String name, String releaseDate, String overview) {
        super(name, releaseDate, overview);
    }

    public Movie(TmdbMovie tmdbMovie) {
        super(tmdbMovie.title(), tmdbMovie.release_date(), tmdbMovie.overview());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() +  " (" + this.getReleaseDate() + ") " + getOverview();
    }
}
