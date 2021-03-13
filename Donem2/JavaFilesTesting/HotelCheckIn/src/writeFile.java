import java.io.File;
import java.util.Scanner;

public class writeFile {
    private Scanner x;

    public void OpenFile() {
        try {
            x = new Scanner(new File("otelKayit.txt"));
        } catch (Exception e) {
            System.out.println("Could not found file");
        }
    }
}
