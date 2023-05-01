package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rating {
    public void danaLove(List<Fighter> fightersList) {

        Collections.sort(fightersList);
        System.out.println();
        System.out.println("Pound 4 Pound");
        viewRating(fightersList);


    }

    public void danaWeight(List<Fighter> fighterslist, Category category) {
        List<Fighter> NYweight = new ArrayList<>();
        for (Fighter f : fighterslist) {
            if (f.getWeight_category().equals(category)) {
                NYweight.add(f);
            }

        }
        System.out.println();
        System.out.println(category);
        viewRating(NYweight);

    }

    public void viewRating(List<Fighter> fighterList) {
        int i = 1;
        for (Fighter f : fighterList) {
            System.out.println(i++ + ". " + f.getName() + " " + " " + f.getRating());

        }


    }
}
