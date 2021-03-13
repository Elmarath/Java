package NYP_Odev4;

import java.util.ArrayList;
import java.util.Scanner;

public class soru1 {

    public static void removeDuplicate(ArrayList<Integer> listesi) {
        for (int i = 0; i < listesi.size(); i++) {
            for (int j = i; j < listesi.size(); j++) {
                if (listesi.get(i) == listesi.get(j) && i != j) {
                    listesi.remove(j);
                }
            }
        }
        System.out.println("Tekrar edilenler ayiklanmiş dizi:");
        System.out.println(listesi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listesi = new ArrayList<>();

        System.out.println("10 adet sayi giriniz");
        for (int i = 0; i < 10; i++) {
            listesi.add(sc.nextInt());
        }
        System.out.println("Ham dizi:");
        System.out.println(listesi);
        removeDuplicate(listesi);

        sc.close();
    }
}
