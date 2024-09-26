import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String bilddatenString = "QQQQRRRRRRTTTTTTTTTTLLLLLLLLLLLMNNNVVVVVVVVVVVAAAAAAAAAAAAA";
        String[] bilddaten = bilddatenString.split("");
        String komprimierteDaten = "";
        int anzahl;
        int index;
        int i;
        index = 0;

        while (index < bilddaten.length) {
            anzahl = 0;
            i = index;

            while (i < bilddaten.length && bilddaten[i].equals( bilddaten[index]) ) {
                i++;
                anzahl++;
            }

            if (anzahl > 3) {
                komprimierteDaten +="§";
                komprimierteDaten +=Integer.toString(anzahl);
                komprimierteDaten += bilddaten[index];
                index = index + anzahl;

            } else {
                i = 0;
                while (i < anzahl) {
                    komprimierteDaten += bilddaten[index];
                    i++;
                }

                index = index + anzahl;
            }
        }
        System.out.println(komprimierteDaten);
    }
}