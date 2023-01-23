package SSG.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Soru2 {

    public static void main(String[] args) {


        // iki tane list olusturun.  bu listlerden biri digerini iceriyor mu?

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);

        list2.add(12);
        list2.add(13);



        boolean m = list1.containsAll(list2);
        boolean n = list1.contains(list1);  //   list eger listi icerisyor mu diye bakmak istersek contains all
        System.out.println(m);
        System.out.println(n);
    }
}
