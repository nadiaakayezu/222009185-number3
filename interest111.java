public class interest111 {
    class compaund{ // this line display class named compound 
        public double Display(int p, double r, int t,int n){
            return p* (Math.pow((1+r/1200),n*t));
        }
    }
    class Main{
        public static void main(String[]args){
            compaund a=new compaund();
            double Output=a.Display(500000,18,3,12);
            System.out.println("Output is :"+Output);// the message to be appear in output 
        }
    }
}
