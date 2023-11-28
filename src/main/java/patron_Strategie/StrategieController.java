package patron_Strategie;

public class StrategieController {
    public static void main(String[] args) {
        // Create an article with an initial price
        Article article = new Article(55.0);

        // Create a view for the article
        VueArticle vue = new VueArticle();

        // Set the initial strategy
        vue.setStrategie(new NeutreAffichage());

        // Display the price using the initial strategy
        System.out.println("Initial Strategy:");
        vue.afficherPrix(article);

        // Change strategy at runtime
        System.out.println("\nChanging to RalentieAffichage Strategy:");
        vue.setStrategie(new RalentieAffichage());
        vue.afficherPrix(article);

        // Change strategy again
        System.out.println("\nChanging to ArrondieAffichage Strategy:");
        vue.setStrategie(new ArrondieAffichage());
        vue.afficherPrix(article);

        // Change strategy once more
        System.out.println("\nChanging to DoNothingAffichage Strategy:");
        vue.setStrategie(new DoNothingAffichage());
        vue.afficherPrix(article);
    }
}