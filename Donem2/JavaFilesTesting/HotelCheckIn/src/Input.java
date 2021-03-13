import java.util.Scanner;

public class Input {
    void InputEmployee() {
        Scanner sc = new Scanner(System.in);
        int key;
        int roomNumber;

        System.out.println("Rezeryasyon icin 1, Iptali icin 2");
        key = sc.nextInt();
        System.out.println("Ilgili oda numarasi: ");
        roomNumber = sc.nextInt();
        if (key == 1) {
            BookRez(roomNumber);
        } else if (key == 2) {
            UnBookRez(roomNumber);
        } else {
            System.out.println("Gecersiz giris");
        }

        sc.close();
    }

    void BookRez(int roomNumber) {
        System.out.println("Book Rez");
    }

    void UnBookRez(int roomNumber) {
        System.out.println("UnBookRez");
    }
}
