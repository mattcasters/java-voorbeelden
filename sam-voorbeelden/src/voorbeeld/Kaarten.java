package voorbeeld;

import java.util.Random;

public class Kaarten {
  public static void main(String[] args) {
    // Genereer 52 speel kaarten in willekeurige volgorde.
    // Zorg dat je nooit 2 keer dezelfde kaart krijgt door gewoon elke kaart maar 1 maal te gebruiken in de array.
    //
    int[] kaarten = new int[52];
    for (int i=0;i<kaarten.length;i++) {
      kaarten[i] = i;
    }

    // Verplaats ze per 2 van plaats. Gebruik willekeurige locaties.
    //
    Random random = new Random();
    for (int i=0;i<250;i++) {
      int index1 = (int)(random.nextDouble()*52);
      int index2 = (int)(random.nextDouble()*52);

      int kaart = kaarten[index1];
      kaarten[index1] = kaarten[index2];
      kaarten[index2] = kaart;
    }

    // Druk het resultaat af.
    // Kaart 0-12 : Koeken, 13-25 : Harten, 26-38 : Klaveren, 39-51 : Schoppen
    //
    String[] kleuren = {"Koeken", "Harten", "Klaveren", "Schoppen"};
    String[] soorten = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "dame", "heer"};
    for (int i = 0; i<kaarten.length; i++) {
      int kleurIndex = kaarten[i] / 13;
      int soortIndex = kaarten[i] % 13;

      System.out.printf("Kaart nr. %2d : %s %s\n", i+1, kleuren[kleurIndex], soorten[soortIndex]);
    }
  }
}
