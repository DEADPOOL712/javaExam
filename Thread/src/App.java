class A extends Thread {
    public void run() {
        try {

            while (true) {
                System.out.println("Inside A...");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread {
    public void run() {
        try {

            while (true) {
                System.out.println("Inside B...");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class x implements Runnable {
    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
                System.out.println("Inside x........");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class y implements Runnable {
    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
                System.out.println("Inside y........");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class App {

    public static void main(String[] args) {
        x objx = new x();
        y objy = new y();
        Thread t1 = new Thread(objx);
        Thread t2 = new Thread(objy);
        t1.start();
        t2.start();

    }
}