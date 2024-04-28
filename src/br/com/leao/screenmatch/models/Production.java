package br.com.leao.screenmatch.models;

public class Production {
    private String name;
    private int releaseYear;
    private boolean includedInSubscription;
    private double rating;
    private short totalRating;
    private int durationInMinutes;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInSubscription(boolean includedInSubscription) {
        this.includedInSubscription = includedInSubscription;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTotalRating(short totalRating) {
        this.totalRating = totalRating;
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
}
