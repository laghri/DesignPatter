package patron_Strategie;

public class VueArticle {
    private AffichageStrategy strategie;

    public void setStrategie(AffichageStrategy strategie) {
        this.strategie = strategie;
    }

    public void afficherPrix(Article article) {
        strategie.afficherPrix(article);
    }
}