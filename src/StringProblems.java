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
        if (s1.equals(s2)) {
            return s1 + " and " + s2 + " are the same";
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.substring(i, i + 1).equals(s2.substring(i, i + 1))) {
                } else {
                    diff = s1.indexOf(s1.substring(i, i + 1)) + 1;
                    break;
                }
            }
        }
        return s1 + " and " + s2 + " are not the same. They differ at letter number " + diff;
    }

    public static void main(String[] args) {
        System.out.println(differentStrings("Table", "Tablet"));
    }

    public static boolean isPalindrome(String word) {
        return true;
    }
}
