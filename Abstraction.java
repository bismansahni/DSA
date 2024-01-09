// covers abstraction from https://www.youtube.com/watch?v=a199KZGMNxk



public class Abstraction {
    public static void main(String[] args) {
        // Car car= new Car();
        // car.price=20000;
        // System.out.println("the cost is "+ car.price);



       Audi c=new Audi();
       c.price=31000;
       System.out.println("The price is "+c.price);
       c.start();


        BMW b=new BMW();
       b.price=20000;
       System.out.println("The price is "+b.price);
       b.start();


       
    }

}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Country Audi is starting");
       
        
    }

}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("Country BMW is starting");
       
       
    }
   

}


  abstract class Car{
    int price;
   abstract void start();
       
    

 }
