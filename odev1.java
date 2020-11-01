import java.util.Random;
import java.util.Scanner;
/*
birinci indisten itibaren aramaya başla bulana kadar devam et
*/

import javax.sound.sampled.Line;

/*
Binary search:
Problemde aranacak uzayın tam orta noktasına bak
Şayet aranan değer bulunduysa bit
Şayet bakılan değer aranan değerden büyükse arama işlemini problem uzayının küçük elamanlarında devam ettir.
Şayet bakılan değer arana değerden küçükse arama işlemini problem uzayının büyük elemanlarında devam ettir.
Şayet bakılan aralık 1 veya daha küçükse aranan değer bulunamadı olarak bitir.
*/

class HelloWorld {

    public static int[] insertionSort(int[] list) {
        int temp, i, j;
        for (i = 1; i < 100; i++) {
            temp = list[i];
            j = i - 1;
            while (j >= 0 && list[j] > temp) {
                // swaping
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
        return list;
    }

    public static int LinearSearch(int[] Array, int Searched_int) {
        for (int i = 0; i < 100; i++) {
            if (Array[i] == Searched_int) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] list, int Searched_int) {

        int Searched_index;

        // these are indexes
        int mid = 49;
        int high = 99;
        int low = 0;
        boolean run = true;
        while (run) {
            if (Searched_int < list[mid]) {
                high = mid;
                mid = (low + mid) / 2;
            } else if (Searched_int > list[mid]) {
                low = mid;
                mid = (high + mid) / 2;
            } else if (Searched_int == list[mid]) {
                return Searched_index = mid;
            } else if (low + 1 == mid && low + 2 == high) {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating array
        Random random = new Random();
        System.out.println("Dizi:");
        int Array[] = new int[100];
        // initializing array
        for (int i = 0; i < 100; i++) {
            Array[i] = random.nextInt(1000);
        }
        // making array sort
        Array = insertionSort(Array);
        // printing sorted array:
        for (int i = 0; i < 100; i++) {
            System.out.print(Array[i] + " ");
        }
        // searching for the number which entered.
        System.out.println("\nAramak istediginiz sayiyi giriniz:");
        int Searched_int = sc.nextInt();

        System.out.println("Dogrusal aramaya gore sayinin indexi: ");
        int sonucDogrusal = LinearSearch(Array, Searched_int);
        if (sonucDogrusal != -1) {
            System.out.println(sonucDogrusal);
        } else {
            System.out.println("Dizide boyle bir eleman bulunmamaktadir.");
        }
        System.out.println("Ikili aramaya göre sayinin indexi:");

        int sonucIkili = BinarySearch(Array, Searched_int);
        if (sonucIkili != -1) {
            System.out.println(sonucIkili);
        } else {
            System.out.println("Dizide boyle bir eleman bulunmamaktadir.");
        }
    }
}