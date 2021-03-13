package NYP_Odev5_polymorphism;

import java.util.ArrayList;
import java.util.Vector;

public class Soru2 {
    public static void main(String[] args) {

        // ikisi de dinamik boyuta sahip
        // ancak eger toplam boyut asilirsa vektor boyutunu %100, arraylist boyutunu %50
        // arttırır.
        int VectorBoyut = 5;
        int ArrayListBoyut = 5;

        ArrayList<Integer> arList = new ArrayList<Integer>();
        // default boyut 10
        Vector<Integer> vector = new Vector<Integer>(VectorBoyut);
        // arraylist i kullanmak threadSafe olmadigi icin daha hizli
        for (int i = 1 + 10; i <= ArrayListBoyut + 10; i++) {
            arList.add(i);
        }
        // vector kullanmak threadSafe oldugu icin daha yavas
        for (int i = 1; i <= VectorBoyut; i++) {
            vector.add(i); // arraylerdeki gibi sayi ekleyebilriz.
        }

        System.out.println(arList);

        System.out.println(vector);

        arList.remove(3);
        vector.remove(3);

        System.out.println(vector);

        for (int i = 0; i < arList.size(); i++) {
            System.out.println(arList.get(i));
        }

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

    }
}
