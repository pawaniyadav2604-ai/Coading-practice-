package OOPS;

public class Abstraction {
    public static void main(String[] args) {
       lepord s1= new lepord();
       s1.tiger();
       s1.walk();

       chicken s2=new chicken();
       s2.tiger();
       s2.walk();
    }
}
abstract class animal{
     void tiger(){
        System.out.println("tiger");
    }
    abstract void walk();
}
class lepord extends animal{
    void walk(){
        System.out.println("walkson 4 legs");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
