package TP2;

import java.util.Timer;
import java.util.TimerTask;

public class ArticleRun {
    public static void main(String[] args) {
        Article article = new Article(50.0);

        Actor acteur1 = new Actor("Consommateur1", article, 45.0);
        Actor acteur2 = new Actor("Consommateur2", article, 40.0);
        Actor acteur3 = new Actor("Organisme1", article, 48.0);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Simuler une variation aléatoire du prix de l'article
                if (Math.random() < 0.5) {
                    article.moreExpensive();

                } else {
                    article.cheaper();
                }
            }
        }, 0, 3000);
    }
}
