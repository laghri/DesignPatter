package TP2;

public class Consumer implements Observer {
    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof Article) {
            Article article = (Article) subject;
            System.out.println("Consumer " + name + " notified. Current price: " + article.getPrice());
            // Implement your logic based on the price change
        }
    }
}


