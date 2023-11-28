package patron_Strategie;

public class ArrondieAffichage implements AffichageStrategy {
    public void afficherPrix(Article article) {
        System.out.println("Prix arrondi : " + (article.getPrix() / 10) * 10);
    }
}