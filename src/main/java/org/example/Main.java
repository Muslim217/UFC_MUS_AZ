package org.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fighter fighter0 = new Fighter("Anderson silva", "Spider", 46, 84, 188, 94, 94, 98, 90, 93);
        Fighter fighter1 = new Fighter("Nick Diaz", "209", 39, 77, 185, 88, 92, 90, 85, 85);
        Fighter fighter2 = new Fighter("Robert Whittaker", "The Reaper", 32, 84, 180, 91, 91, 91, 91, 91);
        Fighter fighter3 = new Fighter("Israel Adesanya", "The Last Stylebender", 33, 84, 193, 94, 94, 98, 88, 95);
        Fighter fighter4 = new Fighter("Alexsandro Pereira", "Poatan", 35, 84, 193, 89, 96, 88, 84, 88);
        List<Fighter> fighters = new ArrayList<>();
        fighters.add(fighter0);
        fighters.add(fighter1);
        fighters.add(fighter2);
        fighters.add(fighter3);
        fighters.add(fighter4);


        Rating ratingP4P = new Rating();
        ratingP4P.danaLove(fighters);
        ratingP4P.danaWeight(fighters, Category.Welterweight);
        System.out.println("С библиотекой ");
        System.out.println("ratingP4P = " + ratingP4P);
        System.out.println("ratingP4P = " + ratingP4P);

    }
}