package Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap01 {

    /*

    1) Map yapilarini "USD = 40000000" seklindeki datalari depolamak icin kullaniriz
    2)"USD = 40000000" datasinin USA  kismi " key" olarak adlandirilir . ve key ler unique dir
    3) "USD = 40000000" datasinin 40000000 kismi Value olarak adlandirilir ve value lar tekarli olabilirler
    4)Yani bu data tipi icerisnide farkli yapida olan degiskenleri barindirabiliyor
    bu datalarin her birine entery denir . entryler key ve valur dan olusurlar
    aslinda bunu cift boyutlu dizi gibi dusunebilirm
    5)Hashmap ler cok hizlidir . cunku entry leri siralmak ile ugrasmaz
    6) sadece bir tane key null olabilir
    7) buna karsilik birden fazla value null olabilir
    8)multitread ve senkronize degillerdir
    Data nin icerisnde = sembolu yoktur !!!!!!!
     */

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("USA", 400000000);
        System.out.println(hm);
        hm.put("germay", 80888888);
        hm.put("hatay", 200000);
        System.out.println(hm);
        hm.put("germany", 200);
        System.out.println(hm);
        hm.put("germany", 900);
        System.out.println(hm);
        hm.put(null, 222);
        System.out.println(hm);
        Set<String> keyler = hm.keySet();
        System.out.println(keyler);
        hm.put("aaa", null);
        System.out.println(hm);
        Collection<Integer> valuelar = hm.values();
        System.out.println(valuelar);

        int sum = 0;
        for (Integer w : valuelar) {

            if (w != null) {
                sum = sum + w;
            }

        }
        System.out.println(sum);


        int a = hm.get("hatay");
        System.out.println(a);

        hm.replace("hatay", 12);                       // bir key nin value sunu degistirmek icin kullanilir
        System.out.println(hm);

        hm.putIfAbsent("hatay", 183);
        hm.putIfAbsent("ad", 3);
        System.out.println(hm);




    }         // main


}

