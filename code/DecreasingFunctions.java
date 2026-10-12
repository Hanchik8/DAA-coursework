public class DecreasingFunctions {
    public static void printOnce(int n) {
        if (n > 0) {
            System.out.println(n);
            printOnce(n - 1);
        }
    }

    public static void printNTimes(int n) {
        if (n > 0) {
            for (int loopIndex = 0; loopIndex < n; loopIndex++) {
                System.out.println(n);
            }

            printNTimes(n - 1);
        }
    }

    public static void printWithDoublingLoop(int n) {
        if (n > 0) {
            for (long loopValue = 1; loopValue < n; loopValue *= 2) {
                System.out.println(n);
            }

            printWithDoublingLoop(n - 1);
        }
    }

    public static void callTwice(int n) {
        if (n > 0) {
            System.out.println(n);

            callTwice(n - 1);
            callTwice(n - 1);
        }
    }
}
