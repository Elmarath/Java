import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        // making a new file
        try {
            File myObj = new File("deneme.txt");
            if (myObj.createNewFile()) {
                System.out.println("FileCreated");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        char[] x = { 'a', 'b', 'c', 'd', 'e' };

        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("deneme.txt"));
        for (int i = 0; i < x.length; i++) {
            // Maybe:
            outputWriter.write(x[i] + "");
        }
        outputWriter.flush();
        outputWriter.close();

    }
}
