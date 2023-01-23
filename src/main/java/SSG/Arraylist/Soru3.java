package SSG.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soru3 {
    public static void main(String[] args) {

        System.out.println("deneme");
        //  bir list olusturun ve bu listin elemanlarini alfabetik siraya göre yazdirin

        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmet");

        list.add("Canan");
        list.add("Derman ");
        list.add("Elif");
        list.add("Baba");

        System.out.println(list);

        System.out.println("alfabetik siraya gore ");

     // listleri  alfabetik  siraya gore siralmak icin  collectionlar kullaniliyorduk
        // Düz   arraylarda sort varla yapabiliyoruz stringleri


        String arr[] = {"a","b","r","c"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
