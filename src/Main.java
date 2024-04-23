import br.com.leao.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("O poderoso chefão");
        movie.setReleaseYear(1972);
        movie.setIncludedInSubscription(true);
        movie.setDuration(175);
        movie.rateMovie(9.5);
        movie.showTechnicalInfo();
        System.out.println("Média de avaliações: " + movie.getRating());
        System.out.println("Total de avaliações: " + movie.getTotalRating());
    }
}
