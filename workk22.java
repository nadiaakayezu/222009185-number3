 class eating { // declare 
    void table1(){
        System.out.println("mango");
        System.out.println("orange");
        System.out.println("apple");
        
    }
}
class pays extends  eating{
public void  table2(){
    System.out.println("rice");
    System.out.println("beans");
    System.out.println("potatoes");
}
}
class  feed extends pays{
    void  table3(){
        System.out.println("water");
        System.out.println("beer");
        System.out.println("wine");
    }
}
interface  feeds{
    void  table4();
}
class F extends  feed implements feeds{
   public void  table4(){
    System.out.println("suchi");
    System.out.println("bagga");
    System.out.println("bread");
}
}
public class class2 {
    public static void main(String[] args) {
        F  eat= new F();
         eat.table1();
         eat.table2();
         eat.table3();
         eat.table4();

    }
}
         
 
