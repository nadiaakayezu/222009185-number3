public class break2 {
    public static void main(String[] args) { //entry point of java

        int i = 1;// declare integer variable 

        do {
            if (i == 5) {

                i++;
                break;
            }
            System.out.println(i);// this is to be displayed 
            i++;
        } while (i <= 10);
    }
}
