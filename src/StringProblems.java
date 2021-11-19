import java.util.Locale;

public class StringProblems {

    public static String addHyphens(String s) {
        String newStr = "";
        for(int i = 0; i < s.length(); i++) {
            newStr += s.substring(i, i+1) + "-";
        }
        return newStr.substring(0, newStr.length() - 1);
    }

    public static String everyOtherLetter(String s) {
        String newStr = "";
        for(int i = 0; i < s.length(); i += 2) {
            newStr += s.substring(i, i + 1);
        }
        return newStr;
    }


    public static String differentStrings(String s1, String s2) {
        int diff = 0;
        String s1Lower = s1.toLowerCase();
        String s2Lower = s2.toLowerCase();
        if (s1Lower.equals(s2Lower)) {
            return s1 + " and " + s2 + " are the same";
        } else {
            if (s1Lower.length() > s2Lower.length()) {
                for (int i = 0; i < s2Lower.length() - 1; i++) {
                    if (!(s1Lower.substring(i, i + 1).equals(s2Lower.substring(i, i + 1)))) {
                        diff = s1Lower.indexOf(s1Lower.substring(i, i + 1)) + 1;
                        break;
                    }
                    diff = s2Lower.length() + 1;
                }

            } else if (s2Lower.length() > s1Lower.length()) {
                    for (int i = 0; i < s1Lower.length() - 1; i++) {
                        if (!(s1Lower.substring(i, i + 1).equals(s2Lower.substring(i, i + 1)))) {
                            diff = s1Lower.indexOf(s1Lower.substring(i, i + 1)) + 1;
                            break;
                        }
                        diff = s1Lower.length() + 1;
                    }
                } else {
                for (int i = 0; i < s1Lower.length() - 1; i++) {
                    if (!(s1Lower.substring(i, i+1).equals(s2Lower.substring(i, i+1)))) {
                        diff = s1Lower.indexOf(s1Lower.substring(i, i+1)) + 1;
                        break;
                    }
                }
            }
            return s1 + " and " + s2 + " are not the same. They differ at letter number " + diff;
        }
    }

    public static void main(String[] args) {
        System.out.println(differentStrings("", ""));
    }

    public static boolean isPalindrome(String word) {
        return true;
    }
}
