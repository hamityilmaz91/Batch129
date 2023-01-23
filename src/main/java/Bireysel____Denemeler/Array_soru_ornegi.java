package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_soru_ornegi {

    public static void main(String[] args) {


        //Bir  integer Array'de verilen bir değer
        //ışındaki elamanları yeni bir Array olarak yazdıran bir method yazınız.

        int arr[] = {1, 4, 7, 94, 45, 34, 23, 68, 89, 00};
        System.out.println(Arrays.toString(arr));  //[1, 4, 7, 94, 45, 34, 23, 68, 89, 0]

        System.out.println("yeniarray(arr) = " + Arrays.toString(yeniarray(arr)));


    }//main metod

    private static int[] yeniarray(int[] arr) {

        System.out.println(" lutfen silmek istediginiz elemanlari giriniz");
        Scanner input = new Scanner(System.in);
        int silinecek = input.nextInt();
        int brr[]= new int[arr.length-1];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==silinecek){

                continue;
            }else {
                brr[idx] = arr[i];
                idx++;
            }
        }
        return brr ;


    }// ara metod


}
