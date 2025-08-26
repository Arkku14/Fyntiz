import java.util.Scanner;
import java.util.Random;

public class robo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] vastaukset = {
                "Mielenkiintoista, kerro lisää!",
                "Aika jännää!",
                "Eikö olekin?",
                "En ole varma, mitä tarkoitat.",
                "mitä mieltä olla?",
                "Hahhaa, hauska vitsi :DD",
                "Mitä mieltä olet itse asiasta?",
                "Onpa hauskaa keskustella!",
                "Onko huomennna keskiviikko? Tai ehkä tiistai?",
                "Tiesitkö että tämän on koodannut Armin?",
                "Joo, en tuu auttaa sua läksyissä :DD",
                "No on se ihan kivaa.",
                "Kiva kuulla!",
                "No jos kerran on pakko.",
                "KYLLÄ",
                "Juu",
                "Huomenna",
                "Kiitos hyvää!",
                "Kyllä kiitos.",
                "No ei ikävä kyllä.",
                "Hauska fakta: tiesitkö että sytkäri keksittiin ennen tulitikkuja?"

        };

        System.out.println("Hei! Keskustellaan. (Kirjoita lopeta lopettaaksesi keskustelu)");

        while (true) {
            System.out.print("Sinä: ");
            String syote = scanner.nextLine();

            if (syote.equalsIgnoreCase("lopeta")) {
                System.out.println("Fyntiz: Oli kiva jutella, moikka!");
                break;
            }

            String vastaus = vastaukset[random.nextInt(vastaukset.length)];
            System.out.println("Fyntiz: " + vastaus);
        }

        scanner.close();
    }
}