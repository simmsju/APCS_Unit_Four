import java.util.Scanner;

public class Disemvoweling {
    public static String disemvowel(String word) {

        String newWord = "";
        String letter = "";
        for (int i = 0; i < word.length(); i++) {
            letter = word.substring(i, i + 1);
            if (!(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))) {
                newWord += letter;
            }
        }
        return newWord;
    }

    public static String repeats(String wordDis) {
        String finalWord = "";
        String letter1 = "";
        String letter2 = "";
        finalWord += wordDis.substring(0 ,1);
        for (int i = 1; i < wordDis.length(); i++) {
            letter1 = wordDis.substring(i - 1, i);
            letter2 = wordDis.substring(i, i + 1);
            if (!(letter2.equals(letter1))) {
                finalWord += letter2;
            }
        }
        return finalWord;
    }

    public static double getPercentage(String first, String last) {
        int bLength = first.length();
        double eLength = last.length();
        double percentage = ((int)((100 - eLength/bLength * 100) * 10 + 0.5)) / 10.0;
        return percentage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the disemvoweling utility.");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Phrase: ");
        String word = s.nextLine();
        String phrase = repeats(disemvowel(word));

        System.out.println("The disemvoweled phrase is: " + phrase);
        System.out.println("Reduced from " + word.length() + " to " + phrase.length() + " characters. Reduction rate of " + getPercentage(word, phrase) + "%");
    }
}
