package Bireysel____Denemeler;

import java.util.Scanner;

public class Ascikarakter_sorusu {

    public static void main(String[] args) {


        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
        Scanner input = new Scanner(System.in);


        System.out.println("lutfen iki karakter giriniz");
        char ilkharf =input.next().charAt(0);


        System.out.println("lutfen ikinci karakter girinz");
        char ikinciharf =input.next().charAt(0);

        char aradakiharfler ;
        int min = Math.min(ilkharf,ikinciharf);
        System.out.println(min);
        int max = Math.max(ilkharf,ikinciharf);
        System.out.println(max);
        for (int i = min+1; i <max ; i++) {

            aradakiharfler=(char) i;
            System.out.print(aradakiharfler+" ");

        }




















    }//main
}
