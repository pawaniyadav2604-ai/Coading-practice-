package OOPS;

public class Inheritence {
    public static void main(String[] args) {
     fish a = new fish();
     a.swim();
     a.eats();

     Mamal b = new Mamal();
     human h= new human();
     h.speak();
    }
}
/// ///// Base class / Parent class1
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mamal extends Animal{
   void walk(){
       System.out.println("animal can walk");
   }
}

class  human extends Mamal{
    void  speak(){
        System.out.println(" human can speak languages");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("Bird can fly");
    }
}

class fish extends  Animal{
    void swim(){
        System.out.println("Fish can swim ");
    }
}

/// ///// Child class / Derived class
//class Fish extends  Animal{
//    int fins;
//    void swim(){
//        System.out.println(" swims in water");
//    }
//}
