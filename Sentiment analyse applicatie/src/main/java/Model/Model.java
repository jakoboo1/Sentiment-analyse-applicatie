package Model;

import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Model {

private ArrayList<Integer> sentimentlijst = new ArrayList<>();

    public void analyseer(String zin,Label label) {

        //Arrays met woorden.
        String[] HelePositieveWoorden  = {"very good" , "amazing" , "the best"};
        String[] PositieveWoorden  = {"good" , "better" , "fine"};
        String[] NeutraleWoorden  = {"normal" , "average" , "sober"};
        String[] NegatieveWoorden  = {"bad" , "shit" , "fail", "lose"};

        //Een loop voor het uitlezen van de arrays met woorden en kijken of deze terug komen in de zin.
        for (int i = 0; i < 3 ; i++) {

            if (zin.toLowerCase().contains(HelePositieveWoorden[i])) {

                System.out.println(HelePositieveWoorden[i]);
                sentimentlijst.add(4);

            } if (zin.toLowerCase().contains(PositieveWoorden[i])) {

                System.out.println(PositieveWoorden[i]);
                sentimentlijst.add(3);

            } if (zin.toLowerCase().contains(NeutraleWoorden[i])){

                System.out.println(NeutraleWoorden[i]);
                sentimentlijst.add(2);

            } if (zin.toLowerCase().contains(NegatieveWoorden[i])){

                System.out.println(NegatieveWoorden[i]);
                sentimentlijst.add(1);
            }
            else {
                System.out.println("geen match!");
            }
            System.out.println(teller(sentimentlijst,label));
        }

    }

    //Een functie die telt hoeveel woorden van elke lijst terugkomen in de zin.
    public ArrayList<Integer> teller(ArrayList<Integer> sentimentlijst, Label label) {

        int resultaatNegative = Collections.frequency(sentimentlijst, 1);
        int resultaatNeutral = Collections.frequency(sentimentlijst, 2);
        int resultaatPositive = Collections.frequency(sentimentlijst, 3);
        int resultaatVeryPositive = Collections.frequency(sentimentlijst, 4);

        conclusie(resultaatNegative, resultaatNeutral, resultaatPositive, resultaatVeryPositive,label);

        return sentimentlijst;
    }

    //Deze functie trekt de conclusie aan de hand van de uitkomst van de teller functie.
    public void conclusie(int resultaatNegative, int resultaatNeutral, int resultaatPositive, int resultaatVeryPositive, Label label) {

        if (resultaatPositive + resultaatVeryPositive >= resultaatNeutral + resultaatNegative) {
//            System.out.println("Het sentiment is positief.");
            label.setText("Het sentiment is positief.");
        }
        else if (resultaatPositive + resultaatVeryPositive <= resultaatNegative + resultaatNeutral) {
//            System.out.println("Het sentiment is Negatief.");
            label.setText("Het sentiment is Negatief.");
        }
        else if (resultaatPositive + resultaatVeryPositive + resultaatNegative <= resultaatNeutral){
//            System.out.println("Het sentiment is neutraal.");
            label.setText("Het sentiment is neutraal.");

        }
        else label.setText("Deze dataset kan niet worden gebruikt!");
    }

}
