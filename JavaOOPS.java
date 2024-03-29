// implementation of oops in java
// studied from https://www.youtube.com/watch?v=a199KZGMNxk
//encapsulation is not covered here


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
        System.out.println("The count is "+Person.count);


        Developer d1=new Developer(31, "Bissu");
        d1.walk();
        d1.walk(2);


    }
}


class Developer extends Person{
    public Developer (int age, String name){
        super(age,name);


    }

    void walk(){
        System.out.println("Developer "+name+"is walking");
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