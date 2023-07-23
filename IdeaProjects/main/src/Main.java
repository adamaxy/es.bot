import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int sterline = 10000;
        double sterlinaToEuro;
        int giorni = 0;
        Random rand = new Random();

        while (sterline > 0) {
            sterlinaToEuro = 1 + (rand.nextDouble() * 0.2); // Calcola il tasso di cambio ogni giorno
            if (sterlinaToEuro > 1.15) {
                int quantitaDaVendere = Math.min(sterline, 1000); // Vende fino a 1000 sterline o le sterline rimanenti se meno
                double euro = quantitaDaVendere * sterlinaToEuro;
                sterline -= quantitaDaVendere;
                System.out.println("Giorno " + (giorni + 1) + ": Vendute " + quantitaDaVendere + " sterline per " + euro + " euro");
            }
            giorni++;
        }

        System.out.println("Ci sono voluti " + giorni + " giorni per vendere tutte le sterline.");
    }
}







