package Bitmeyen_Exceptionlar;

import java.util.Scanner;

public class Run_time_Deneme {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ogrencinin notunu giriniz ");
        int sayi = input.nextInt();

        if (sayi < 0) {

            try {
                throw new Benim_run_time_Exceptionim("sayi sifirdan kucuk olamaz");
            }finally {
                System.out.println(8+5);
                System.out.println(" exception handl edilmemesine ragmen try catch blogu calisti ama " +
                        "hala uygulama calismiyor ");
            }
        }
    }
}




