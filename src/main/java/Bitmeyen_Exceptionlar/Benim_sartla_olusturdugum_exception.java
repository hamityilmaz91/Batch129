package Bitmeyen_Exceptionlar;

import java.util.Scanner;

public class Benim_sartla_olusturdugum_exception {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" lutfen ogrencinin notunu girin ");

        int not = input.nextInt();

        if (not <0){

            try {
                throw new IllegalArgumentException("Ogrenci notu sifir olamay");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println(not);
        }

    }
    // run  time exceptionlarda deklerasyon  hatayi onlemiyor ,handl etmiyor


}
