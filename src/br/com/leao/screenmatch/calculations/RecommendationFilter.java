package br.com.leao.screenmatch.calculations;

public class RecommendationFilter {
    public void Filter(StarsRate starsRate) {
        int stars = starsRate.getRatingInStars();
        String name = starsRate.getName();
        if (stars >= 4) {
            System.out.printf("%s tem: %d estrelas. Muito recomendado.\n", name, stars);
        } else if (stars >= 2) {
            System.out.printf("%s tem: %d estrelas. Recomendado.\n", name, stars);
        } else {
            System.out.printf("%s tem: %d estrelas. Vale a pena dá uma chance.\n", name, stars);
        }
    }
}
