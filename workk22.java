class  eating {
    void  table1(){
        System.out.println(" mango");
        System.out.println(" apple");
        System.out.println(" donats");
        
    }
}
class pays extends  eating{
public void  table2(){
    System.out.println(" banana");
    System.out.println(" rice");
    System.out.println(" omlet");
}
}
class Land extends pays{
    void  table3(){
        System.out.println(" soyasos");
        System.out.println(" tanaty");
        System.out.println(" sanajuice");
    }
}
interface landa{
    void   eating();
}
class t extends eating implements landa{
   public void  table4(){
    System.out.println(" banana");
    System.out.println(" juice");
    System.out.println(" passion");
}
}
public class  workk22 {
    public static void main(String[] args) {
        t   table= new t();
         table. table1();
         table. eating();
         table. eating();
         table. table4();

    }
}
