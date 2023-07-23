
class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person s) {
        this.name = s.name;
        this.age = s.age;
    }
}

class Ticket {
    static int Remain;

    void detail() {
        System.out.println("Sold : " + (100 - Remain));
    }

    void update(int value) {
        Remain = Remain - value;
    }

    // static class EventInfo {
    // static void info() {
    // System.out.println("Date ->");
    // System.out.println("Menu ->");
    // System.out.println("Time ->");
    // }
    // }
    class EventInfo {
        static void info() {
            System.out.println("Date ->");
            System.out.println("Menu ->");
            System.out.println("Time ->");
        }
    }

}

// Final varibale -> constant
// Final Method -> cant override
// Final Calls -> cant extend

// ! Encapsulation -> hiding details from outside word and paking together in
// one
// class
// setter and getter method for accessing data
// objective is to secure data
// use access modifier to achive encapsulation
// implementation sage
class BankAccount {
    private String holdername;
    private int balance;

    public void setter(String h, int b) {
        this.holdername = h;
        this.balance = b;
    }

    public String getter_holder() {
        return this.holdername;
    }

    public int getter_balance() {
        return this.balance;
    }
}

// ! Abstraction -> hidding how its working
// use Abstract class for that
// Abstract class cant use to create object
// design state
// hide complex code from user
// Example
abstract class life {
    String type = "Humal";

    public abstract void info(); // only declaration of method in abstract form

    public void simpleMethod() {
        System.out.println("Inside Abstract class!");
    }
}

class Human extends life {
    public void info() {
        System.out.println("Inside Human class");
    }
}

// Interface
interface P1 {
    static int p1 = 10;

    void p1Method();
}

interface P2 {
    int p2 = 20;

    void p2Method();
}

interface Q extends P1, P2 {
    int q = 10;

    void qMethod();
}

class combine implements Q {
    combine() {

        System.out.println(p1);
    }

    @Override
    public void p1Method() {
        // TODO Auto-generated method stub

    }

    @Override
    public void p2Method() {
        // TODO Auto-generated method stub

    }

    public void qMethod() {
        // TODO Auto-generated method stub

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        // copy constructor
        // Person p1 = new Person("vaibhav", 20);
        // Person p2 = new Person(p1);

        // static
        // Ticket t1 = new Ticket();
        // Ticket.Remain = 100;
        // Ticket.EventInfo e = new Ticket.EventInfo(); // for static
        // Ticket.EventInfo e = t1.new EventInfo(); // non static

        // Encapsulation
        // BankAccount b1 = new BankAccount();
        // b1.setter("vaibhav", 250000);
        // System.out.println(b1.getter_holder());
        // System.out.println(b1.getter_balance());

        combine c = new combine();

    }
}
