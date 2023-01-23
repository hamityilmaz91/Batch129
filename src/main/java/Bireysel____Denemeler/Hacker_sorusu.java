package Bireysel____Denemeler;

import java.util.Arrays;
import java.util.Scanner;

public class Hacker_sorusu {
    public static void main(String[] args) {


         /*Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek
  şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (foreach loop kullanınız)*/


        System.out.println(" bu bir mesaj sifreleme programidir ");
        System.out.println("sifrelenecek metni giriniz");
        Scanner input = new Scanner(System.in);
        String orijinal_metin = input.nextLine();//


        String[] ilkhal = orijinal_metin.split("");
        System.out.println(Arrays.toString(ilkhal));//
        String sifreliarr[] = new String[ilkhal.length];
        char sifrelimetin;
        String sifrelimerinsa = "";
        char kdfkgj;
        String kjdsgnksergbkrjv = "";
        for (String w : ilkhal) {

            int a = w.charAt(0) + 1;

            sifrelimetin = (char) a;
            sifrelimerinsa = sifrelimerinsa + sifrelimetin;


        }
        System.out.println(sifrelimerinsa);

        System.out.println("tekrar eski haline getirme");
        String diyi[] = sifrelimerinsa.split("");

        for (String w : diyi) {

            int aa = w.charAt(0) - 1;
            kdfkgj = (char) aa;
            kjdsgnksergbkrjv = kjdsgnksergbkrjv + kdfkgj;


        }
        System.out.println(kjdsgnksergbkrjv);


    }//MAIN
}//CLASS
