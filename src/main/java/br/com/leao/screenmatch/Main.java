package br.com.leao.screenmatch;

import br.com.leao.screenmatch.models.ApiResponse;
import br.com.leao.screenmatch.models.Movie;
import br.com.leao.screenmatch.models.TmdbMovie;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            Dotenv dotenv = Dotenv.load();
            var token = dotenv.get("TOKEN");
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o nome do filme: ");
            String encodedMovieName = URLEncoder.encode(input.nextLine(), StandardCharsets.UTF_8);
            input.close();

            var url = "https://api.themoviedb.org/3/search/movie?query=" + encodedMovieName + "&language=pt-BR";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url)).header("accept", "application/json").header("accept", "application/json")
                    .header("Authorization", "Bearer " + token)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            var gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();
//            ApiResponse<Movie> movieResponse = gson.fromJson(response.body(), new TypeToken<ApiResponse<Movie>>(){}.getType());
//            System.out.println(movieResponse);
            ApiResponse<TmdbMovie> tmdbMoviesResponse = gson.fromJson(response.body(), new TypeToken<ApiResponse<TmdbMovie>>(){}.getType());
            List<TmdbMovie> tmdbMovies = tmdbMoviesResponse.getResults();
            List<Movie> movies = tmdbMovies.stream().map(Movie::new).collect(Collectors.toList());
            System.out.println(movies);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}