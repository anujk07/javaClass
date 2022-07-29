package OOPS.ex1;

class Men{
   String name;
   


}

public class OOPS {
    public static void main(String args[]) {

        // Cars obj1 = new Cars();

        Men obj = new Men();


        Student s1 = new Student("Anirudh", 23);
        
        s1.getInfo();
  
        Student s2 = new Student("Abhinav", 20);
        s2.getInfo();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    Student(Cars obj){

    }
   
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
 
 }
