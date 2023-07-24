import First.*;

class myex extends Exception {
    String msg;

    myex(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String toString() {
        return msg + " -from toString.";
    }
}

public class Custom {
    public static void main(String[] args) {
        try {
            throw new myex("Hello cutie Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
