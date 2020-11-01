import java.lang.Math;

public class odev3 {

    public static int[][] sayilar() {
        int[][] noktalar = new int[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 2; j++) {
                int x = (int) (Math.random() * 50) - 25;
                int y = (int) (Math.random() * 50) - 25;
                if (j == 0)// x value
                    noktalar[i][j] = x;
                else if (j == 1)// y value
                    noktalar[i][j] = y;
            }
        return noktalar;
    }

    public static void main(String[] args) {
        // (x,y) seklinde 5 nokta olusturulacak

        int[][] nokta = sayilar();

        double uzaklik = 0;
        double min_uzaklik = 72;// greater than max value
        int[] min_noktalar = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    uzaklik = Math
                            .sqrt(Math.pow((nokta[i][0] - nokta[j][0]), 2) + Math.pow(nokta[i][1] - nokta[j][1], 2));
                    System.out.println("nokta: " + i + " = [" + nokta[i][0] + "," + nokta[i][1] + "]" + " ve " + " ["
                            + nokta[j][0] + "," + nokta[j][1] + "] uzaklık: " + uzaklik);
                    if (uzaklik < min_uzaklik) {
                        min_uzaklik = uzaklik;
                        min_noktalar[0] = i;
                        min_noktalar[1] = j;
                    }
                }
            }
        }

        System.out
                .println("Birbirine en yakin noktalar: (" + nokta[min_noktalar[0]][0] + "," + nokta[min_noktalar[0]][1]
                        + ") ve (" + nokta[min_noktalar[1]][0] + "," + nokta[min_noktalar[1]][1] + ")");
        System.out.println("noktalar arasindaki minimum uzaklik: " + min_uzaklik);

    }
}
