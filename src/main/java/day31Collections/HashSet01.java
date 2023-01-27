package day31Collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        // collection lar coklu eleman depolamak icindir.
        // collection lar da 6 tane senaryo var . Biz burda bunlari ogrenecez. hangisi nerde kullanilir?
        // Arraylistleri ogrendik bunlar arasinda . Linkedlistleri ogrendik bunlar arasinda
        // SIMDI SET::: TEKRARSIZ DATA DEPOLAMAK ICIN KULLANILAN BIR COLLECTION DIR
        // SETLER 3 E AYRILIR


       // 1) Hashset: super hizlidirlar . cnuki verdigimiz elemanlari siralamak icin zaman
        // kaybetmezler .yani hashsetlere eklenen elemanlar rastgele siralanirlar
        // hashsetler tekrarli elemana musade etmezler
        // hashset ler  null i eleman olarak kabul ederler . ama sadece 1 tane



        // 2) LinkedHashSet:
        // linkedhassetler tekrarli elemana musade etmez
        // elemanlari insertion order a gore dizer.(belli bir siraya gore )
        //elemmanlari siralmakta zaman kaybettigi icin hashset e gore yavastir
        //


        //3)TreeHashSet
        //Treehashsetler tekrarli elemana musade  etmezler
        // elemanlari naturalorder a gore dizer( ya kucukten buyuge ya da alfabetik siralama )
        //cok cok cok yavastir . Natural order zordur . her seferinde tum seti gozden gecirir








        // Hash bir tekniktir . JAVA  bu teknigi kullanarak unic datalar uretir:
        // hangi  sisteme gore unic bilgi uretilecek. bu teknige hashing teknik diyorlar
       // Hashing Technique. bunu universite boyle berlirlemis java da kendine gore belirler
        // java arka tarafta hashing teknik kullanir ve HER DATA ICIN JAVA BIR HASH KOD ÜRETIR


        // DATALAR TEKRARLI OLABILIR AMA HASH KODLAR KESINLIKLE TEKRARSIZDIR :
      //  SIMDI KULLANICI BIR DATA ISTEDI JAVADAN:
     //   JAVA O BILGININ HASH KODUNU BULACAK: SONRA O BILGIYE GIDECEK SONRA ONU KULLANICIYA VERECEK


     // SET KELIMESI:::: TEKRARIZ DATA DEMEK: IT DE SET KELIMESINI DUYARSANIZ TEKRARI YOK DEMEK
     //AYNI ELEMANI ARRAY LIST VE LINKED LISTLERDE KULLANABILIRZ:
     // AMA SET KABUL ETMEZ
     // TEKRARSIZ DATALARI DEPOLAMAK ICIN SET KULLANMALIYIM
     // MESELA E MAIL ADRESLERI : MESELA KIMLIK NUMALARI

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(22);
        hs.add(32);
        hs.add(42);
        hs.add(52);
        hs.add(62);
        hs.add(72);
        hs.add(72);
        hs.add(82);

        System.out.println(hs);//[32, 52, 22, 42, 12]
        // hashset e eleman eklemedigin surece ilk rastgele calismasindan sonra hep yani yazdiriyor
       // burda iki nokta var . birincisi elemanlari yazdigin siraya gore degil rastgele yerlestiriyor
        // ama ilk eleman yerlestikten sonra eger baska bir eleman liste eklenmezse artik her calistirmaya ayni sonucu veriyor



    }
}
