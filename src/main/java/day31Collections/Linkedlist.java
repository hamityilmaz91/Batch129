package day31Collections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {


        List<String> citynames = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();
        System.out.println(citynames);
        System.out.println(names);
        names.add("Ahmet");
        names.add("Ayse");
        names.add("Ali");
        names.add("kemal");
        names.add("metin");
        names.add("nasip");
        System.out.println(names);
        names.add(3,"AHHHHH");// simdi biz linked listlerde boyle index iceren metodlar kullanacaz ama linkelistlerde index yokkk

        System.out.println(names);
        names.addFirst("Belki bu sefer ");
        System.out.println(names);
        citynames.add("ssss");
        citynames.add("ssss");
        citynames.add("ssss");
        names.addAll(citynames);
        System.out.println(names);

        citynames.clear();
        System.out.println(citynames);
        String isim =names.remove();// cut paste
        System.out.println(isim);
        System.out.println(names);
        names.remove("Ahmet");//  gordugu ilk ajdayi sildi ve break yapti
        System.out.println(names);

        names.remove(4);
        //  remove kullaniyorsan metodu oku birseyler donderiyor mu ona bak


        names.removeFirstOccurrence("ibje ismi ");

        names.peek();// ilk elemani copy past yapar
        names.peekLast();
        names.poll();// cut paste

        // eger linked listte hic eleman yoksa remove(cut-paste) bu hata verir. Ama  pool  null verir()

        names.pop();//== remove first ile ayni




    }

}
