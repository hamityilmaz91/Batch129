package SSG.Arraylist;

import java.util.ArrayList;

public class Soru5 {

    // bir dogal sayi listi olusturun ve bu listteki tüm elemanlari toplayin

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(143);
        list.add(1243);
        list.add(1342);
        list.add(124345);

        int toplam = 0;

        for (Integer w : list) {
            toplam=toplam+w;

        }
        System.out.println(toplam);
    }

}
