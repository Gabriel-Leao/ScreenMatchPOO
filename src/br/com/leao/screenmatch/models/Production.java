package br.com.leao.screenmatch.models;

import br.com.leao.screenmatch.calculations.StarsRate;

public class Production implements StarsRate {
    final
    private String name;
    final
    private int releaseYear;
    private boolean includedInSubscription;
    private double rating;
    private short totalRating;
    private int durationInMinutes;

    public Production(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() { return name; }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public boolean getIsIncludedInSubscription() {
        return includedInSubscription;
    }

    public short getTotalRating() {
        return totalRating;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setIncludedInSubscription(boolean includedInSubscription) {
        this.includedInSubscription = includedInSubscription;
    }

    public void setDuration(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showTechnicalInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Na assinatura: " + includedInSubscription);
        System.out.printf("Nota: %.1f\n", rating);
        System.out.println("Total de avaliações: " + totalRating);
        System.out.println("Duração: " + durationInMinutes);
    }

    public void rateProduction(double grade) {
        totalRating++;
        rating = (rating + grade) / totalRating;
    }

    @Override
    public int getRatingInStars() {
        return (int) getRating() / 2;
    }
}
