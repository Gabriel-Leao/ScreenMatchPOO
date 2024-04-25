package br.com.leao.screenmatch.models;

public class Serie extends Production {
    private int seasons;
    private int episodes;
    private Boolean ongoing;

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public Boolean getOngoing() {
        return ongoing;
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
}
