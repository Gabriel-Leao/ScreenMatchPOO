package br.com.leao.screenmatch.main;

import br.com.leao.screenmatch.calculations.CalculateTotalTime;
import br.com.leao.screenmatch.models.Episode;
import br.com.leao.screenmatch.models.Movie;
import br.com.leao.screenmatch.models.Production;
import br.com.leao.screenmatch.models.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("O poderoso chefão", 1972);
        movie.setDirector("Francis Ford Coppola");
        movie.setIncludedInSubscription(true);
        movie.setDuration(175);
        movie.rateProduction(9.5);
//9        movie.showTechnicalInfo();
//        System.out.println("Média de avaliações: " + movie.getRating());
//        System.out.println("Total de avaliações: " + movie.getTotalRating());

        Serie serie = new Serie("Breaking Bad", 2008);
        serie.setIncludedInSubscription(true);
        serie.setSeasons(5);
        serie.setEpisodes(62);
        serie.rateProduction(9.7);
        serie.setOngoing(false);
        serie.setMinutesPerEpisode(45);
//        System.out.println("Duração total: " + serie.getDurationInMinutes() + " minutos");
//        serie.showTechnicalInfo();
//        System.out.println("Média de avaliações: " + serie.getRating());
//        System.out.println("Total de avaliações: " + serie.getTotalRating());
//        System.out.println("Temporadas: " + serie.getSeasons());
//        System.out.println("Episódios: " + serie.getEpisodes());
//        System.out.println("Em andamento: " + serie.getOngoing());

        Episode ep = new Episode();
        ep.setName("Pilot");
        ep.setNumber(1);
        ep.setSeason(1);
        ep.setSerie(serie);
        ep.setStars(5);

        Movie movie2 = new Movie("O poderoso chefão 2", 1974);
        movie2.setDirector("Francis Ford Coppola");
        movie2.setIncludedInSubscription(true);
        movie2.setDuration(202);
        movie2.rateProduction(9.0);
        CalculateTotalTime calculateTime = new CalculateTotalTime();
        calculateTime.addProductionTime(movie);
        calculateTime.addProductionTime(movie2);
        calculateTime.addProductionTime(serie);
//        System.out.println("Tempo total: " + calculateTime.getTotalTime());
//        RecommendationFilter RecommendationFilter = new RecommendationFilter();
//        RecommendationFilter.Filter(movie);
//        RecommendationFilter.Filter(movie2);
//        RecommendationFilter.Filter(serie);
//        RecommendationFilter.Filter(ep);

        var movie3 = new Movie("Hereditário", 2018);
        movie3.setDirector("Ari Aster");
        movie3.setIncludedInSubscription(true);
        movie3.setDuration(127);
        movie3.rateProduction(9.0);

        List<Production> list = new ArrayList<>();
        list.add(movie);
        list.add(movie2);
        list.add(movie3);
        list.add(serie);
//        System.out.println("Tamanho da lista " + list.size());
        for (Production production : list) {
//            System.out.println(production);
            if (production instanceof Movie movieProduction) {
//                System.out.println("Diretor: " + movieProduction.getDirector());
            }
        }

        List<String> actors = new ArrayList<>();
        actors.add("Brad Pitt");
        actors.add("Edward Norton");
        actors.add("Helena Bonham Carter");
        actors.add("Al Pacino");
        actors.add("Marlon Brando");
        actors.add("Robert De Niro");
        Collections.sort(actors);
        Collections.sort(list);
        list.sort(Comparator.comparing(Production::getReleaseYear));
        System.out.println(list);
    }
}
