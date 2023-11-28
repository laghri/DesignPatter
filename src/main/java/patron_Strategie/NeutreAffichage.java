package patron_Strategie;

public class NeutreAffichage implements AffichageStrategy {
    public void afficherPrix(Article article) {
        System.out.println("Prix précis : " + article.getPrix());
    }
}