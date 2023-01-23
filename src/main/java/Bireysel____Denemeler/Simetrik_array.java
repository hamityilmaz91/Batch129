package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;

public class Simetrik_array {
    public static void main(String[] args) {


        // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.

        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        List<Integer> ilkparca = new ArrayList<>();
        List<Integer> ikinciparca = new ArrayList<>();

        if (arr.length % 2 != 0) {

            System.out.println("Bu Array simetrik degilir ");
        }

        for (int i = 0; i < arr.length / 2; i++) {

            ilkparca.add(arr[i]);
            System.out.println(ilkparca);

        }
        for (int j = arr.length - 1; j >= arr.length / 2; j--) {
            ikinciparca.add(arr[j]);
            System.out.println(ikinciparca);
        }

        if (ilkparca.equals(ikinciparca)) {

            System.out.println("Simetrik arraylerdir");
        }


    }//main
}//class
