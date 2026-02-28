package OOPS;

public class Classandobjects {
    public static void main(String[] args) {
        pen p1 = new pen();// created a pen obj called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip("5");
        System.out.println(p1.getTip());

        // is tarah bhi value assign kr sakte hai
        p1.setColor(" yellow");
        System.out.println(p1.getColor());
    }
}

class pen{
    // properties aur functions ko hum define karenge isme ;
    String color;
    String tip;
   // getters
    String getColor(){
        return  this.color;
    }

    String getTip(){
        return this.tip;
    }
 // setters
    void setColor(String newColor){
        color= newColor;
    }

    void setTip( String newTip ){
        tip = newTip;
    }
}