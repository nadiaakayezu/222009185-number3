public class nestedddd {// declare a public class named "nestedddd".
    public static void main(String[] args) {
        int size = 6;// declare integer variable size and declare it's value which is 6.

        for (int i = 1; i <= size; i++) { //Start a loop where "i" ranges from 1 to "size".
            for (int j = 1; j <= size; j++) {
                System.out.print("$");
            }
            System.out.println();//move to the bnext line after printing the dolar signs in the inner looop.
        }
    }
}

