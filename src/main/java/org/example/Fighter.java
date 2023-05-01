package org.example;

public class Fighter {

    private String name;
    private String nickname;
    private int age;
    private int weight;
    private int height;
    private int rating;
    private Category weight_category;
    private int boxing_attack;
    private int wrestling_attack;
    private int boxing_protection;
    private int wrestling_protection;

    public Fighter(String name, String nickname, int age, int weight, int height, int rating, int boxing_attack,
                   int boxing_protection, int wrestling_attack, int wrestling_protection) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.rating = rating;
        this.boxing_attack = boxing_attack;
        this.boxing_protection = boxing_protection;
        this.wrestling_attack = wrestling_attack;
        this.wrestling_protection = wrestling_protection;


        if (weight <= Category.Flyweight.getWeight()) {
            weight_category = Category.Flyweight;
        } else if (weight <= Category.Bantamweight.getWeight()) {
            weight_category = Category.Bantamweight;
        } else if (weight <= Category.Featherweight.getWeight()) {
            weight_category = Category.Featherweight;
        } else if (weight <= Category.Lightweight.getWeight()) {
            weight_category = Category.Lightweight;
        } else if (weight <= Category.Welterweight.getWeight()) {
            weight_category = Category.Welterweight;
        } else if (weight <= Category.Middleweight.getWeight()) {
            weight_category = Category.Middleweight;
        } else if (weight <= Category.LightHeavyweight.getWeight()) {
            weight_category = Category.LightHeavyweight;
        } else if (weight <= Category.Heavyweight.getWeight()) {
            weight_category = Category.Heavyweight;
        }

    }

    @Override
    public String toString() {
        return name + " " + nickname + " " + "Age = " + age +
                ", Weight = " + weight +
                ", Height = " + height +
                ", Rating = " + rating +
                ", Weight_category = " + weight_category +
                ", boxing_attack = " + boxing_attack +
                ", wrestling_attack = " + wrestling_attack +
                ", boxing_protection = " + boxing_protection +
                ", wrestling_protection = " + wrestling_protection;
    }


    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getRating() {
        return rating;
    }

    public Category getWeight_category() {
        return weight_category;
    }

    public int getBoxing_attack() {
        return boxing_attack;
    }

    public int getWrestling_attack() {
        return wrestling_attack;
    }

    public int getBoxing_protection() {
        return boxing_protection;
    }

    public int getWrestling_protection() {
        return wrestling_protection;
    }


    public int compareTo(Object o) {
        Fighter f = (Fighter) o;
        return f.rating - this.rating;
    }

}
