package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List__Liste_urun_ekleme_ornegi {
    public static void main(String[] args) {


        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
        //gosteren kodu yaziniz.
        //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X
        Scanner input = new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        System.out.println("c = " + c);//c = [A, K, R, S]
        String urun = "";
        do {


            System.out.println("lutfen aradiginiz urunu girinz");
            System.out.println("cikmak icin q");
            urun = input.next();

            if (urun.equals("q")){
                break;
            }
            if (c.contains(urun)) {

                c.set(c.indexOf(urun), "Ayrildi");

            } else {

                c.add(urun);
            }

        } while (true);
        System.out.println(c);


    }
}
