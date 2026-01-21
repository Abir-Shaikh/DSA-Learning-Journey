package recursion;

public class Question9 {
    public static int getMaxPieces(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        int cutA = getMaxPieces(n - a, a, b, c);
        int cutB = getMaxPieces(n - b, a, b, c);
        int cutC = getMaxPieces(n - c, a, b, c);

        int result = Math.max(cutA, Math.max(cutB, cutC));

        if (result == -1) {
            return -1;
        }

        return result + 1;
    }

    public static void main(String[] args) {
        int n = 23;
        int a = 12, b = 11, c = 15;

        int totalPieces = getMaxPieces(n, a, b, c);

        if (totalPieces != -1) {
            System.out.println("Maximum pieces possible: " + totalPieces);
        } else {
            System.out.println("No valid cuts possible.");
        }
    }
}