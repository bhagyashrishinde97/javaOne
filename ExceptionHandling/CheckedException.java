package ExceptionHandling;


import java.io.File;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        File file = new File("extension.txt");
        try {
            boolean t1 = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean t = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



