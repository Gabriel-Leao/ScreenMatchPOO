package br.com.leao.screenmatch.models;

import br.com.leao.screenmatch.calculations.StarsRate;

public class Episode implements StarsRate {
    private String name;
    private int number;
    private int season;
    private Serie serie;
    int stars;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getRatingInStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (stars < 0 || stars > 5) throw new IllegalArgumentException("As estrelas devem estar entre 0 e 5.");
        this.stars = stars;
    }
}
