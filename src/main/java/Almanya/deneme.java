package Almanya;

import Parenttaki_classtan_cocugun_metoduna_atlama.A;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {

        String arr[] = {"a", "l", "i"};
        String brr[]= new  String[3];
        brr[0]="a";
        brr[1]="l";
        brr[2]="i";


        StringBuilder isim = new StringBuilder("java is good.");
        System.out.println(isim);
        String ad = isim.toString();
        String deneme = Arrays.toString(arr);
        System.out.println(deneme.length());
        System.out.println(deneme+1);





    }
}
