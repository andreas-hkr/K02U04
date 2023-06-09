import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Användaren skall mata in en mening med minst två ord
        // Skriv därefter ut:
        //   - Antal tecken
        //   - Första ordet
        //   - Sista ordet

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in en mening med minst två ord:");
        String sentence = input.nextLine();

        int count = sentence.length();
        int firstSpace = sentence.indexOf(' ');
        int lastSpace = sentence.lastIndexOf(' ');
        String firstWord = sentence.substring(0, firstSpace);
        String lastWord = sentence.substring(lastSpace+1);

        System.out.println("Meningen du matade in innhåller " + count + " tecken");
        System.out.println("Det första ordet var: " + firstWord);
        System.out.println("Det sista ordet var: " + lastWord);
    }
}