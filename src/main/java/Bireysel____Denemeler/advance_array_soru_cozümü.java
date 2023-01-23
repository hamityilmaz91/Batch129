package Bireysel____Denemeler;

import java.util.Arrays;
import java.util.Scanner;

public class advance_array_soru_cozümü {

    public static void main(String[] args) {
        //   Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
        //   Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        Scanner input = new Scanner(System.in);
        System.out.println(" dizinizin kac elemanli oldugunu girin."); // 5 elemali array
        int size = input.nextByte();
        int ortaindex;
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("dizinin" + (i + 1) + ". elemanini girin");
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));//   [3,5,6,7,8]   [3 5 6 8 9 11 14]
        Arrays.sort(arr);

        if (arr.length % 2 != 0) {
            ortaindex = (arr.length / 2) ;

            System.out.println(arr[ortaindex]);     // [2 4 5 7 6 7 ]  4 boyut

        } else {

            System.out.println(((arr[arr.length / 2] + arr[arr.length /2 -1]) / 2));                                             //   [2 4 6 8 ]
          //  System.out.println((arr[arr.length / 2] + arr[arr.length - 1])/2);


        }


    }// main
}//class
