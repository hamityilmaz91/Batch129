package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;

public class List_elemanlarinin_metodla_degisimi {
    public static void main(String[] args) {

        /*
		 bir list oluşturalım.
		 sonra list elemanlarını degiştir methodu yazıp orada
		 list elemanlarından bazılarını degiştirelim.
		 method void olsun.
		 main methoda döndükten sonra yeniden listi yazdıralım
		 */


        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        System.out.println("maindeki ilk array hali ");
        System.out.println(harfler);


        elemandegistir(harfler);

        System.out.println();
        System.out.println();
        System.out.println("maine dondukten sonra yazdigim array");

        System.out.println(elemandegistir(harfler));
        System.out.println(harfler);


    }

    private static List<String> elemandegistir(List<String> harfler) {
        System.out.println("\n\n");
        System.out.println("metoda gelen array ");
        System.out.println(harfler);///[A, B, C, D]
        ArrayList<String> metodda_islem_yapacagim_array =new ArrayList<>();

        for (String s : harfler) {

            metodda_islem_yapacagim_array.add(s);

        }
        System.out.println("METODDA OLUSTURDUGUM LIST ");
        System.out.println(metodda_islem_yapacagim_array);

        metodda_islem_yapacagim_array.set(2,"mmm");
        System.out.println();
        System.out.println();
        System.out.println("metodda islem gormus array");
        System.out.println(metodda_islem_yapacagim_array);

        return metodda_islem_yapacagim_array;


    }


}
