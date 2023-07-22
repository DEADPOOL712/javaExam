// Exception in java
// Checked and unchecked 
// checked -> complie time io,file
// unchecked -> run time , arithmetic,array,index,string

// custom exception 

import java.io.FileNotFoundException;
import java.io.FileReader;

class customExc extends Exception {
}

public class App {
    public static void main(String[] args) throws Exception { // ignore all checked exception
        System.out.println("Hello, World!");
        div(0, 0);
        convert(null);
        ReadFile("Abc.txt");
    }

    public static void convert(String x) {
        System.out.println(x.length());
    }

    public static void ReadFile(String path) throws FileNotFoundException {
        FileReader fr = new FileReader(path); // checked exception

    }

    public static void div(double x, double y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("E");
            }
            {

                System.out.println("div -> " + x / y);
            }
        } catch (Exception e) {
            System.out.println("Exception occured !");
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
