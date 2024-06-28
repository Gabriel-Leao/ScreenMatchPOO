package br.com.leao.screenmatch.models;

import br.com.leao.screenmatch.calculations.StarsRate;
import com.google.gson.annotations.SerializedName;

public class Production implements StarsRate, Comparable<Production> {
    final
    @SerializedName("title")
    private String name;
    final
    private String releaseDate;
    final
    private String overview;
    private boolean includedInSubscription;
    private double rating;
    private short totalRating;
    private int durationInMinutes;

    public Production(String name, String releaseDate, String overview) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.overview = overview;
    }

    public String getName() { return name; }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getOverview() { return overview; }

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
        System.out.println("Lançamento: " + releaseDate);
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

    @Override
    public int compareTo(Production otherProduction) {
        return this.getName().compareTo(otherProduction.getName());
    }
}
