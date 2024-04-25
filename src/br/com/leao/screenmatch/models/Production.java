package br.com.leao.screenmatch.models;

public class Production {
    private String name;
    private int releaseYear;
    private boolean includedInSubscription;
    private double rating;
    private short totalRating;
    private int duration;

    public double getRating() {
        return rating;
    }

    public short getTotalRating() {
        return totalRating;
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

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showTechnicalInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Na assinatura: " + includedInSubscription);
        System.out.printf("Nota: %.1f\n", rating);
        System.out.println("Total de avaliações: " + totalRating);
        System.out.println("Duração: " + duration);
    }

    public void rateProduction(double grade) {
        totalRating++;
        rating = (rating + grade) / totalRating;
    }
}
