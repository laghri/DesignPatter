package TP2;

public class ControlOrganization implements Observer {
    private String organizationName;

    public ControlOrganization(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof Article) {
            Article article = (Article) subject;
            System.out.println("Organization " + organizationName + " notified. Current price: " + article.getPrice());
            // Implement your logic based on the price change
        }
    }
}