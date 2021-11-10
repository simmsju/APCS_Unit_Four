public class ForLoops {

    /**
     * Sample usage:
     * printingHashTags(0) returns ""
     * printingHashTags(4) returns "####"
     *
     * @param num Integer representing the number of hashtags to draw
     * @return A string of hashtags
     */
    public static String printingHashTags(int num) {
        String tags = "";
        for (int i = 0; i < num; i++) {
            tags += "#";
        }
        return tags; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     *
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {
        String nums = "";
        if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                nums += i + " ";
            }
        } else if (num2 > num1) {
            for (int i = num1; i >= num2; i--) {
                nums += i + " ";
            }
        } else {
            nums += num1;
        }
        return nums;
    }

    public static int sumNumbers(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                sum += i;
            }
        }else if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
        } else {
                sum = num1;
            }
        return sum;
    }

    public static int power(int base, int exponent) {
        int pow = 1;
        for (int i = 0; i < exponent; i++) {
            pow *= base;
        }
        return pow;
    }
}
