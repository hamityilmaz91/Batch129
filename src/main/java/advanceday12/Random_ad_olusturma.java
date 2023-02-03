package advanceday12;

import java.util.*;

public class Random_ad_olusturma {

    // Rastgele alinan harfleri bir Stringe ekleyerek adinizi olusturan ve bunu kac deneme ile yaptigini yazdiran kodu

    public static void main(String[] args) {

        //    {Hamit=43}
        Map<String, Integer> map = new HashMap<>();
        String alfabe = "abcdefghijklmnoprstuvyz";
        String isim1 = null;
        String isim2 = null;
        String isim3 = null;
        String isim4 = null;
        String isim5 = null;
        int rastgele;
        int counter1= 0;
        int counter2=0;
        int counter3=0;
        int counter4=0;
        int counter5=0;
        while (true) {
            counter1++;
            rastgele = (int) (Math.random() * 23);

            if (alfabe.charAt(rastgele) == 'h') {
                isim1 = "" + alfabe.charAt(rastgele);
                System.out.println(isim1);
                System.out.println(counter1);
                break;
            }


        }

        while (true) {
            counter2++;
            rastgele = (int) (Math.random() * 23);

            if (alfabe.charAt(rastgele) == 'a') {
                isim2 = "" + alfabe.charAt(rastgele);
                System.out.println(isim2);
                System.out.println(counter2);
                break;
            }


        }

        while (true) {
            counter3++;
            rastgele = (int) (Math.random() * 23);

            if (alfabe.charAt(rastgele) == 'm') {
                isim3 = "" + alfabe.charAt(rastgele);
                System.out.println(isim3);
                System.out.println(counter3);
                break;
            }


        }

        while (true) {
            counter4++;
            rastgele = (int) (Math.random() * 23);

            if (alfabe.charAt(rastgele) == 'i') {
                isim4 = "" + alfabe.charAt(rastgele);
                System.out.println(isim4);
                System.out.println(counter4);
                break;
            }


        }

        while (true) {
            counter5++;
            rastgele = (int) (Math.random() * 23);

            if (alfabe.charAt(rastgele) == 't') {
                isim5 = "" + alfabe.charAt(rastgele);
                System.out.println(isim5);
                System.out.println(counter5);
                break;
            }


        }

        System.out.println(counter1+counter2+counter3+counter4+counter5);
        System.out.println(isim1+isim2+isim3+isim4+isim5);
    }//main
}
