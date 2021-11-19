public class NestedLoops {

    public static String xSquare(int n) {
        String box = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; i++) {
                box += "X";
            }
            box += "\n";
        }
        return box;
    }

    public static String flippedTriangle(int n) {
        String triangle = "";
        for (int i = 1; i <= n; i++) {
            for (int j = n; j <= 1; j--) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String fizzBuzz(int n) {

        return "";
    }
}
