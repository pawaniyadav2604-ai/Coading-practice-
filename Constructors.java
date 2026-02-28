package OOPS;

public class Constructors {
    public static void main(String[] args) {
        student s1= new student();
        s1.name = "pawani";
        s1.roll = 234;
        s1.marks[0]= 99;
        s1.marks[1]= 55;
        s1.marks[2]= 98;

        student s2= new student(s1);
        s1.marks[2] = 5;
        for (int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }



        // System.out.println(s1.name);

//        pawani p1 = new pawani(" pawani ksjhcjnj");
//        System.out.println(p1.name);
//
//        p1.setLastname("yadav");
//        System.out.println(p1.lastname);
    }
}
class student {
    String name;
    int  roll;
    int marks[];
/// // shallow copy constructor //////////
//    student(student s1){
//        this .name= s1.name;
//        this.roll = s1.roll;
//        marks = new int[3];
//        this.marks=s1.marks;
//
//    }

    /// ////////// deep copy constructor ///////
    student( student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll= s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]= s1.marks[i];
        }
    }

//// this is non parameterized constructor.........
    student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
    /// this is  parameterized constructor.........
    student(String name){
        marks = new int[3];
        this.name=name;
   }
}

//class  pawani{
//    String name;
//    String lastname;
//    // cnastructor can be called only one time
//    // this is parameterized constructor .......
//    pawani(String name){
//        this.name = name ;
//    }
//
//     // we cannot create constructor for last name thats why we can use getters and setters to access lastname ;
//    void setLastname(String lastname){
//        this.lastname= lastname;
//    }
//}




