// implementation of oops in java
// this was taken from https://www.youtube.com/watch?v=a199KZGMNxk


public class JavaOOPS {
    public static void main(String[] args) {
        System.out.println("hello");
        Person p1 = new Person();
        p1.age = 32;
        p1.name = "Anuj";
        System.out.println(p1.age + p1.name);

        Person p2 = new Person();
        p2.age = 21;
        p2.name = "Sahni";
        System.out.println(p2.age + p2.name);
        p1.walk(3);
        p2.age();
        

        Person p3=new Person(31,"shanty monty");
        System.out.println("The name is "+p3.name);


    }
}

class Person {
    String name;
    int age;
    static int count=0;
    public Person(){
        System.out.println("constructor call");
        count++;
    }

    public Person(int newAge, String newName){
        name=newName;
        age=newAge;

    }

    void eat() {
        System.out.println(name + " is walking");
    }

    void age() {
        System.out.println(age + " is the age");
    }

    void walk(){
        System.out.println(name+"walks a lot");

    }


void walk(int steps){
        System.out.println(name+"walks"+steps);

    }

}