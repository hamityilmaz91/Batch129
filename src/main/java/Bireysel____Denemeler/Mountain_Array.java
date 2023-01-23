package Bireysel____Denemeler;

import java.util.ArrayList;

public class Mountain_Array {
    public static void main(String[] args) {

  /*
 Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
 Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
  */


        int[] arr = {1, 2, 3, 4, 0, 5, 4, 3, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int counteryukselenseri = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] > 0) {

                list.add(arr[i]);


            }
            counteryukselenseri++;
            if(arr[i + 1] - arr[i] <0) {
                list.add(arr[i]);
            }



        }


    }//MAIN
}//CLASS
