import java.lang.Math;
import java.util.Scanner;

public class odev2 {

    public static int[] selectionSort(int[] list) {
        int i, j, minValue, minIndex, temp = 0;

        for (i = 0; i < 100; i++) {
            minValue = list[i];
            minIndex = i;
            for (j = i; j < 100; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
                if (minValue < list[i]) {
                    temp = list[i];
                    list[i] = list[minIndex];
                    list[minIndex] = temp;
                }
            }
        }

        return list;
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[100];
        int rand;

        for (int i = 0; i < 100; i++) {
            rand = (int) (Math.random() * 1000);
            list[i] = rand;
            System.out.println(list[i]);
        }
        boolean run = true;
        int key;
        while (run) {
            System.out.println("**********************");
            System.out.println("Seçmeli siralama icin 1, Yerlestirmeli siralama icin 2, cikmak icin 0:");
            key = sc.nextInt();
            if (key == 1) {
                list = selectionSort(list);
                for (int i = 0; i < 100; i++) {
                    System.out.println(list[i]);
                }
                continue;
            } else if (key == 2) {
                list = insertionSort(list);
                for (int i = 0; i < 100; i++) {
                    System.out.println(list[i]);
                }

                continue;
            } else if (key == 0) {
                run = false;
            } else {
                System.out.println("Gecersiz karakter girildi.");
                continue;
            }
        }
    }
}
