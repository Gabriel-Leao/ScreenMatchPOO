import br.com.leao.screenmatch.models.Movie;
import br.com.leao.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("O poderoso chefão");
        movie.setDirector("Francis Ford Coppola");
        movie.setReleaseYear(1972);
        movie.setIncludedInSubscription(true);
        movie.setDuration(175);
        movie.rateProduction(9.5);
        movie.showTechnicalInfo();
        System.out.println("Média de avaliações: " + movie.getRating());
        System.out.println("Total de avaliações: " + movie.getTotalRating());
        System.out.println("Diretor: " + movie.getDirector());

        Serie serie = new Serie();
        serie.setName("Breaking Bad");
        serie.setReleaseYear(2008);
        serie.setIncludedInSubscription(true);
        serie.setSeasons(5);
        serie.setEpisodes(62);
        serie.rateProduction(9.7);
        serie.setOngoing(false);
        serie.showTechnicalInfo();
        System.out.println("Média de avaliações: " + serie.getRating());
        System.out.println("Total de avaliações: " + serie.getTotalRating());
        System.out.println("Temporadas: " + serie.getSeasons());
        System.out.println("Episódios: " + serie.getEpisodes());
        System.out.println("Em andamento: " + serie.getOngoing());
    }
}
