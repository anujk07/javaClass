package OOPS.ex2;

public class MainClass {
    public static void main(String args[]) {
       Person p1 = new Person();
       p1.age = 24;
       p1.name = "Anirudh";

       System.out.print(p1.age+" "+ p1.name);
    }
}
class Person {
    String name;
    int age;

    void walking(){
        System.out.println(name+" is walking");
    }

    void eating(){
        System.out.println(name+ "is eating");
    }
}
