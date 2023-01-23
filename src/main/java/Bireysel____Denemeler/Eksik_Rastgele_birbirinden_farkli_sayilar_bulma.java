package Bireysel____Denemeler;

import java.sql.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Eksik_Rastgele_birbirinden_farkli_sayilar_bulma {

    public static void main(String[] args) {

        // 0 den 9 a kadar rastgele 10 sayi uretin ....ve her seferinde birbirinden farkli sayilar uretsin.

        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(arr);
        int a= (int)(Math.random()*11);//5,6
        System.out.println(a);

        while (arr.size()<10){


            if(!arr.contains(a)) {
                arr.add(a);  // arr=[5]
                System.out.println(arr);
                a = (int) (Math.random() * 10);//6 5

            }



        }
        System.out.println(arr);






















}
}
