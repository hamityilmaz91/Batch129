package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eksik_Rastgele_kullanici_adi_olusturan_program {

    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */


        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        System.out.println("databaseIsim = " + databaseIsim);//[AYSE, AHMET, SERDAR, OKAN, BETUL]
        int random;
        Scanner input = new Scanner(System.in);
        String name;

        do {

            System.out.println("lutfen yeni kisiyi girin");
            name=input.next();
            if (!databaseIsim.contains(name)){


                databaseIsim.add(name);
            }else if(databaseIsim.contains(name)){

                random=(int)(Math.random()*10);
                while (databaseIsim.contains(name+random)) {

                    random = (int) (Math.random() * 10);
                }
                name=name+random;

                if(!databaseIsim.contains(name)){
                    databaseIsim.add(name);
                }

            }
            System.out.println(databaseIsim);


        }while (true);




    }



}
