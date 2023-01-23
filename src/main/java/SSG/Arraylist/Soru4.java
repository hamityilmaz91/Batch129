package SSG.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {

        // elimizde urunlerin  bulundu bir list var.
       // istenen siradaki ürünü istedigimz yeni ürünle degistirip
        //eski ürünü var olan eski  urunler listesine ekleyin
ArrayList<String> eski = new ArrayList<>();
        ArrayList<String> urunlistesi = new ArrayList<>();
        urunlistesi.add("tv");
        urunlistesi.add("radio");
        urunlistesi.add("atari");
        urunlistesi.add("saat");
        System.out.println(urunlistesi);//[tv, radio, atari, saat]
        System.out.println(" kacinci siradaki urunu degistirmek istiyorsunz");
        Scanner input = new Scanner(System.in);
        int silinecek = input.nextInt();
        eski.add(urunlistesi.get(silinecek-1));
        System.out.println(" eklemek istediginiz urunu yazin");
        String eklencek =  input.next();

        urunlistesi.set(silinecek-1,eklencek);
        System.out.println(urunlistesi);
        System.out.println("eski list ");
        System.out.println(eski);












    }
}
