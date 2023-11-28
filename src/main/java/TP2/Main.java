package TP2;

public class Main {
    public static void main(String[] args) {

        Article article = new Article(10.0);


        Consumer consumer1 = new Consumer("Ahmed");
        Consumer consumer2 = new Consumer("Yassine");
        ControlOrganization organization1 = new ControlOrganization("ControlOrg1");
        ControlOrganization organization2 = new ControlOrganization("ControlOrg2");


        article.attach(consumer1);
        article.attach(consumer2);
        article.attach(organization1);
        article.attach(organization2);


        article.moreExpensive();
        article.moreExpensive();
        article.cheaper();


        article.detach(organization1);


        article.moreExpensive();


    }
}

