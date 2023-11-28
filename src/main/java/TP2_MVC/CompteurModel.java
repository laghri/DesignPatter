package TP2_MVC;

public class CompteurModel {
    private int compteur;

    public CompteurModel(int initialCompteur) {
        this.compteur = initialCompteur;
    }

    public int getCompteur() {
        return compteur;
    }

    public void incrementer() {
        compteur++;
    }

    public void decrementer() {
        compteur--;
    }
}
