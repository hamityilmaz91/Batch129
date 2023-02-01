package Almanya;

import java.lang.reflect.Array;
import java.util.*;

public class Thrws {

    public static void main(String[] args) {


        LinkedList<Integer> linkelist = new LinkedList<>();
        linkelist.add(3);
        linkelist.add(3);
        linkelist.add(3);
        linkelist.add(3);
        System.out.println(linkelist);

        int toplam = 0;
        for (Integer w : linkelist) {
            toplam = toplam + w;


        }
        System.out.println(toplam);

        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(14);
        hs.add(2);
        hs.add(1162);
        System.out.println(hs);
        Set<Integer> ts = new TreeSet<>();


        System.out.println(ts);

        // Arraylist ,Linkedlist ,

        //  Maplarda depoladigimiz herbir dataya entry denir MAPIN entry leri . Hasmaplerin entry leri unicter .

        // linkedlist in node lari
        HashMap<String, Integer> hashMap = new HashMap<>();
    }
}
