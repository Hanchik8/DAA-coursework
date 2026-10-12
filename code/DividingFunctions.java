public class DividingFunctions {
    public static void printOnce(int n) {
        if (n > 1) {
            System.out.println(n);
            printOnce(n / 2);
        }
    }

    public static void printNTimes(int n) {
        if (n > 1) {
            for (int loopIndex = 0; loopIndex < n; loopIndex++) {
                System.out.println(n);
            }

            printNTimes(n / 2);
        }
    }

    public static void callTwiceWithLoop(int n) {
        if (n > 1) {
            for (int loopIndex = 0; loopIndex < n; loopIndex++) {
                System.out.println(n);
            }

            callTwiceWithLoop(n / 2);
            callTwiceWithLoop(n / 2);
        }
    }
}
