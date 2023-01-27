package Day32collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime();

        //
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(63);
        ts.add(42);
        ts.add(3);
        ts.add(1232);
        System.out.println(ts);
        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(63);
        hs.add(42);
        hs.add(3);
        hs.add(1232);
        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hs);   // Random
        System.out.println(hts);


        long three = System.nanoTime();

        System.out.println(" Treenin uygulama suresu= " + (two - one));
        System.out.println(" Hasset in  uygulama suresu= " + (three - two));

        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
//      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari
//      ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        int first = ts.first();
        System.out.println(first);//3

        int last = ts.last();
        System.out.println(last);//32

        int floor1 = ts.floor(15);
        System.out.println(floor1);//12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

//floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz
        int floor2 = ts.floor(12);
        System.out.println(floor2);//12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi


        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25==>15 elemanlardan biri degil o yuzden 15 den bir sonraki eleman yazdirildi

        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);//25==> 12 elemanlardan biri o yuzden 25 direkt yazdirildi



    }

}