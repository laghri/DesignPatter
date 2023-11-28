package patron_Strategie;

public class RalentieAffichage implements AffichageStrategy {
    public void afficherPrix(Article article) {
        System.out.println("Variation sur cinq : " + (article.getPrix() % 5 == 0 ? article.getPrix() : ""));
    }
}