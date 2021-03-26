import java.util.Scanner;

public class Input {

    // getting the right user input and returning the right process type

    /**
     * UserProcessType writeFile classinda ManipulateArray kullanilacak processType'
     * i dondurur.
     * 
     * @return sonuc integer veri tipinde döndürür
     */
    public int UserProcessType() {
        Scanner sc = new Scanner(System.in);
        int key = 0;
        System.out.println("Otel gorevlisi girisi : 1");
        System.out.println("Misafir girisi icin : 2");
        key = sc.nextInt();
        int processType;

        if (key == 1) {
            processType = InputEmployee();
        } else if (key == 2) {
            processType = InputGuest();
        } else {
            System.out.println("Invalid");
            sc.close();
            return -1;
        }
        sc.close();
        return processType;
    }

    // getting the room number that will be processed
    /**
     * UserProcessType writeFile classinda ManipulateArray kullanilacak roomNumber'
     * ı döndürür.
     * 
     * @return sonuc integer veri tipinde döndürür
     */
    public int InputRoomNumber() {
        Scanner sc = new Scanner(System.in);
        int roomNumber;
        // deciding process type
        System.out.println("Oda numarasini giriniz");
        roomNumber = sc.nextInt();

        if (roomNumber >= 0) {
            return roomNumber;
        } else {
            System.out.println("Invalid");
            return -1;
        }
    }

    // having the right process type value
    /**
     * ProcessType degiskeni icin key value uretir.
     * 
     * @return sonuc integer veri tipinde döndürür
     */
    private int InputEmployee() {
        Scanner sc = new Scanner(System.in);
        int key;
        // deciding process type
        System.out.println("Oda Acmak(b) icin 1:");
        System.out.println("Oda Kapamak(i)  icin 2:");
        key = sc.nextInt();

        if (key == 1 || key == 2) {
            sc.close();
            return key;
        } else {
            System.out.println("Invalid");
            sc.close();
            return -1;
        }

    }

    // having the right process type value
    /**
     * ProcessType degiskeni icin key value uretir.
     * 
     * @return sonuc integer veri tipinde döndürür
     */
    private int InputGuest() {
        Scanner sc = new Scanner(System.in);
        int key;
        // deciding process type
        System.out.println("Oda rezervasyonu(r) icin 1:");
        System.out.println("Oda rezervasyonu iptali(b) icin 2:");
        key = sc.nextInt();

        if (key == 1 || key == 2) {
            sc.close();
            return key + 2; // adding 2 for returning diffrent key values between guest and employee;
        } else {
            System.out.println("Invalid");
            sc.close();
            return -1;
        }
    }

}