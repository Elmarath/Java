import java.io.File;
import java.util.Scanner;

public class readfile {
    private Scanner x;

    public void OpenFile() {
        try {
            x = new Scanner(new File("otelKayit.txt"));
        } catch (Exception e) {
            System.out.println("Could not found file");
        }
    }

    public String ReadFile() {
        String exFile = "";
        int sayac = 0;
        while (x.hasNext()) {
            String a = x.next();
            String b = x.next();
            sayac++;
            System.out.printf("%s %s %d\n", a, b, sayac);
            exFile += a + b + "\n";
        }
        return exFile;
    }

    public void CloseFile() {
        x.close();
    }
}
