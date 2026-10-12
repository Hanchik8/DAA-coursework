public class RecurrenceDemo {
    public static void main(String[] args) {
        if (args.length != 3) {
            printUsage();
            System.exit(1);
        }

        String group = args[0];
        int functionNumber;
        int n;

        try {
            functionNumber = Integer.parseInt(args[1]);
            n = Integer.parseInt(args[2]);
        } catch (NumberFormatException error) {
            System.err.println("The function number and n must be integers.");
            printUsage();
            System.exit(1);
            return;
        }

        if (n < 0) {
            System.err.println("n must be nonnegative.");
            printUsage();
            System.exit(1);
        }

        if (group.equals("decreasing")) {
            switch (functionNumber) {
                case 1:
                    DecreasingFunctions.printOnce(n);
                    break;
                case 2:
                    DecreasingFunctions.printNTimes(n);
                    break;
                case 3:
                    DecreasingFunctions.printWithDoublingLoop(n);
                    break;
                case 4:
                    DecreasingFunctions.callTwice(n);
                    break;
                default:
                    printUsage();
                    System.exit(1);
            }
        } else if (group.equals("dividing")) {
            switch (functionNumber) {
                case 1:
                    DividingFunctions.printOnce(n);
                    break;
                case 2:
                    DividingFunctions.printNTimes(n);
                    break;
                case 3:
                    DividingFunctions.callTwiceWithLoop(n);
                    break;
                default:
                    printUsage();
                    System.exit(1);
            }
        } else {
            printUsage();
            System.exit(1);
        }
    }

    private static void printUsage() {
        System.err.println("Usage: java -cp build RecurrenceDemo <group> <function> <n>");
        System.err.println("Groups: decreasing (functions 1-4), dividing (functions 1-3)");
    }
}
