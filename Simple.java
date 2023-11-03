class Simple{
    public double print(int p, double r, int t){
        return p*r*t;// this method used to calculate simple interest in other word is formula 
    }
}
class Main{ // this display name of class
    public static void main(String[]args){
        Simple a=new Simple();
        double Output=a.print(100000,0.05,5);
        System.out.println("Result:"+Output);//it gona shows the result or amount of compound interest
    }
}

