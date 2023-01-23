package Bireysel____Denemeler;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Rastgele_sifre_ureten_program {
    public static void main(String[] args) {


        //Kullanıcıdan aldığınız sayı
        //
        //
        // kadar
        // karakter uzunluğuna sahip  String
        // rastgele şifre üreten bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen uretilecek sifrenin kac karakterli olmasini istedigini giriniz");

        int uzunluk = input.nextInt();

        StringBuilder rastgeleuretilensifre = new StringBuilder(uzunluk);



        int k;
        // Math.random()  [ 0--1)*65)==> [ 0--65);

        while (rastgeleuretilensifre.length()<=uzunluk){

            k=(int)(Math.random()*100);

            if(k>65 && k<90) {

                System.out.print(k + " ");

                rastgeleuretilensifre.append((char) k+"   ");

            }
        }
        System.out.println(rastgeleuretilensifre);


    }//main
}//class
