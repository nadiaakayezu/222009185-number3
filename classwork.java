class names{
void cv(){
    System.out.println(" i called ser");   
}
  
}
 class gender extends names{
    void  have(){
        System.out.println(" both of them");
    }
}
 class age extends gender{
    void  life(){
        System.out.println("i have life unlimit");
    }
 }
 interface keva{
    void  nana();
 }
 class t extends names implements keva{
public void  nana(){
    System.out.println(" its difficult to know");
}
}
 public class classwork{
    public static void main(String[] args) {
        age G= new age();
        G. cv();
        G. have();
        G. life();
    }
}




