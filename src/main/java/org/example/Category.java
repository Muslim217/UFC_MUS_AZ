package org.example;

public enum Category {

    Flyweight(57), Bantamweight(61),
    Featherweight(66), Lightweight(70),
    Welterweight(77), Middleweight(84),
    LightHeavyweight(93), Heavyweight(120);

    private int weight;

    Category(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
