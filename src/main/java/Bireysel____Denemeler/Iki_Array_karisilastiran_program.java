package Bireysel____Denemeler;

import java.util.ArrayList;

public class Iki_Array_karisilastiran_program {
    public static void main(String[] args) {

           /*
   * İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.
   * (case sensitivity olmadan)
​
   * Input1 :      String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                   String[] brr = {"sofia","brad","grace","emily","hazel"};
​
   * Output : [brad,sofia,emily]

            */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};
        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < brr.length; j++) {

                if(arr[i].equalsIgnoreCase(brr[j])){

                    list.add(arr[i]);

                }

            }



        }
        System.out.println(list);








    }//main
}//class
