package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class List_manipulation {


    public static void main(String[] args) {

//Example 2: Musteriden urun ismini aliniz
        //           Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //           Musterinin ismini verdigi urun listede yoksa "Out of stock" yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hos geldiniz!...");
        System.out.println("Urun aramayi sonlandirmak icin Q'ya basiniz...");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("RadioAKJSFKAS");
        products.add("iPad");
        products.add("PC");
        products.add("NoteboALSJBFASJCok");
        products.add("Mobile Phone");
        System.out.println(products);
        System.out.println();

        for (int i = 0; i < products.size(); i++) {

            products.set(i,products.get(i).toLowerCase(Locale.ROOT));

        }
        System.out.println(products);








/*
        do {
            System.out.println("lutfen aradiginiz urunun ismini girin");
            String urun=input.next();
            if(urun.equalsIgnoreCase("q")){
                System.out.println("yeniden bekleriz");
                break;
            }

            if(products.contains(urun)){

                System.out.println(urun +" su anda  elimiyde mevcut");
            }else {

                System.out.println("out of stockt");
            }
            System.out.println("devam etmek istiyorsaniz ");
            }while (true);
       */

















    }// main
}//class
