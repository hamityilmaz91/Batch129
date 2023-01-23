package Bireysel____Denemeler;

import java.util.Random;

public class Random_yeni_metod {
    public static void main(String[] args) {

        Random rastgele =new Random();
        int sayi =rastgele.nextInt(5);

        //bu 0'dan 4 dahil tamsayi üretir ama int sayi=r.nextInt(5)+1; dersen 1'den baslar.
        //Yani sorasinda +5 yazarsan 5 ten baslatmis olursun Hamit abim. Bu sekilde baslangic degerini kendin belirleyebilirsin
    }
}