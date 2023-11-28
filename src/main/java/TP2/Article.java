package TP2;

import java.util.ArrayList;
import java.util.List;

public class Article implements Subject {
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Article(double initialPrice) {
        this.price = initialPrice;
    }

    public double getPrice() {
        return price;
    }

    public void moreExpensive() {
        price += 1;
        notifyObservers();
    }

    public void cheaper() {
        if (price > 0) {
            price -= 1;
            notifyObservers();
        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

