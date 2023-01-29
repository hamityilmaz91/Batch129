package Bitmeyen_Exceptionlar;

import java.util.Scanner;

public class Ortak {
// senaryo: girilen not sifir ile 100 olmali
    public static void main(String[] args) {


        System.out.println("lutfen ogrencinin notunu giriniz ");
        Scanner input = new Scanner(System.in);
        int not = input.nextInt();

        if(not<0 || not>100){

            try {
                throw new IllegalArgumentException("sifirdan kucuk , yuzden buyuk  girilmez");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }


        System.out.println(not);




    }





}
