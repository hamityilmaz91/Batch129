package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.Collections;

public class List_Birbirine_yakin_sayilari_bulma {
    public static void main(String[] args) {


        //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
        //              [12, 19, 15, 30, 21]  ==>  19 ve 21
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(19);
        arr.add(15);
        arr.add(30);
        arr.add(21);


        Collections.sort(arr);
        System.out.println(arr);
        int fark=Integer.MAX_VALUE;
        for (int i = 1; i < arr.size(); i++) {


            fark=Math.min((arr.get(i)-arr.get(i-1)),fark);


        }//ilk for

        for (int i = 1; i <arr.size() ; i++) {

            if(fark==((arr.get(i)-arr.get(i-1)))){

                System.out.println(arr.get(i-1)+"   "+arr.get(i));
            }

        }

    }//main
}//class
