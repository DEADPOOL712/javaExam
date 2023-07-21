import java.io.*;

// File Input Output 
public class App {
    public static void main(String[] args) throws Exception {
        // ! File calss -> for creating , deleting , searching file
        // File fl = new File("index.txt");
        // System.out.println(fl.getName());
        // System.out.println(fl.getAbsolutePath());
        // System.out.println(fl.length()); // in bytes

        // Steam -> seq of data in or out
        // two types -> 1)Bytes 2)Character
        // ! Byte stream -> read/write in binary
        // ! DataInputStream / DataOutputStream -> primitive data (subclass)
        // ! BufferdInputStream / BufferdOutputStream -> use buffer (subclass)
        // write into bytes formate
        // FileOutputStream fout = new FileOutputStream("abc.txt");
        // String name = "vaibhav";
        // byte b[] = name.getBytes(); // convert string into byte array
        // fout.write(b); // can only pass byte[] or byte
        // fout.close();
        // read from file
        // FileInputStream fin = new FileInputStream("abc.txt");
        // int i = 0;
        // while ((i = fin.read()) != -1) { // read till file end
        // System.out.print((char) i);
        // }
        // fin.close();

        // ! Character Stream -> read/write in character
        // ! Reader / Writer are base class of all below methods
        // ================================================//
        Reader reader = new FileReader("xyz.txt"); // will not create file
        // reader.read() -> will read only one byte

        Writer writer = new FileWriter("xyz.txt");
        // writer.write("Hellow new file!"); -> can write sting directly

        // ================================================//
        BufferedReader bfr = new BufferedReader(reader);
        System.out.println(bfr.readLine()); // read complete line

        BufferedWriter bwr = new BufferedWriter(writer);
        bwr.write("This is new text of new file!!!");

        // ================================================//
        // StringReader srd = new StringReader(reader);
        // only deals with strings not file directly

        bfr.close();
        bwr.close();
        writer.close();
        reader.close();
    }
}
