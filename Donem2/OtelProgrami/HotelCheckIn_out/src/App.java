import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    private class Guest {
        public void DecleareRez() {
            System.out.println("");
        }

        public void UnDecleareRez() {
            System.out.println("");
        }
    }

    private class Receptionist {
        public void DecleareRez() {
            System.out.println("");
        }

        public void DecleareRoom() {
            System.out.println("");
        }

        public void UndecleareRoom() {
            System.out.println("");
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Otel Misafiri Girisi icin: 1");
        System.out.println("Otel Gorevlisi Girisi icin: 2");
        System.out.println("Cikmak Icin: 0");

        int anahtar = sc1.nextInt();
        if (anahtar == 1) {
            System.out.println("Otel Misafiri Girisi:");
        } else if (anahtar == 2) {
            System.out.println("Otel Gorevlisi Girisi:");
        } else if (anahtar == 0) {
            System.out.println("Cikis Yapiliyor.");
        } else {
            System.out.println("Gecersiz giris, Cikis yapiliyor.");
        }

        try {
            File myObj = new File("fileName.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }

    }
}
