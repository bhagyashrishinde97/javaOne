package ExceptionHandling;


import java.io.File;
import java.io.IOException;

public class TryWithMultipleCatch {
    void test() {
        System.out.println("test method");
    }

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Exception.TrywithCatchBlock");
            File file = new File("notes.txt");
            boolean t = file.createNewFile();
            TryWithMultipleCatch obj = null;
            obj.test();


        } catch (ClassNotFoundException ea) {
        } catch (IOException ae) {
        } catch (NullPointerException npe) {
        }
    }
}




