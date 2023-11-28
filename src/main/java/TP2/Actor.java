package TP2;

public class Actor implements Observer {
    private String name;
    private Article article;
    private double threshold;

    public Actor(String name, Article article, double threshold) {
        this.name = name;
        this.article = article;
        this.threshold = threshold;
    }



    @Override
    public void update(Subject subject) {
        double currentPrice = article.getPrice();
        if (currentPrice > threshold) {
            System.out.println(name + ": Current price exceeds the threshold. Price: " + currentPrice);
            // Ajoutez ici la logique spécifique à l'utilisateur ou à l'organisme de contrôle
        } else {
            System.out.println(name + ": Current price is within the threshold. Price: " + currentPrice);
        }
    }
}

