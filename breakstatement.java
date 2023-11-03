public class breakstatement {
    public static void main(String[] args) { // entry point of the program
        int[] numbers = { 1, 3, 5, 7, 8, 9, 11, 12, 13 };// declare integerer number to be initialized 

        for (int number : numbers) { 
            if (number % 2 == 0) {
                System.out.println(" even number that is first iss: " + number);
                break;// this is to be displayed in output
            }
        }
    }
}

