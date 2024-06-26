package br.com.leao.screenmatch.models;

public class Serie extends Production {
    private int seasons;
    private int episodes;
    private Boolean ongoing;
    private int MinutesPerEpisode;

    public Serie(String name, String releaseDate, String overview) {
        super(name, releaseDate, overview);
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public Boolean getOngoing() {
        return ongoing;
    }

    public int getMinutesPerEpisode() {
        return MinutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return episodes * MinutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Série: " + this.getName() +  " (" + this.getReleaseDate() + ") - " + this.seasons + (this.seasons > 1 ? " temporadas " : " temporada ") + getOverview();
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        MinutesPerEpisode = minutesPerEpisode;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setOngoing(Boolean ongoing) {
        this.ongoing = ongoing;
    }

    @Override
    public void showTechnicalInfo() {
        System.out.println("Nome: " + getName());
        System.out.println("Ano de lançamento: " + getReleaseDate());
        System.out.println("Na assinatura: " + getIsIncludedInSubscription());
        System.out.printf("Nota: %.1f\n", getRating());
        System.out.println("Total de avaliações: " + getTotalRating());
        System.out.println("Episódios: " + getEpisodes());
        System.out.println("Minutos por episódio: " + getMinutesPerEpisode());
        System.out.println("Duração total: " + getDurationInMinutes() + " minutos");
    }
}
