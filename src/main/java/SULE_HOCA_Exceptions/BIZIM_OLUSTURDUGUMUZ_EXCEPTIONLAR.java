package SULE_HOCA_Exceptions;

import java.util.Scanner;

public class BIZIM_OLUSTURDUGUMUZ_EXCEPTIONLAR {

    // KULLANICIDAN ALDIGINIZ YASI EKRANA YAZDIRAN KODU YAZINIZ

    public static void main(String[] args) {

        System.out.println("lutfen yasinizi giriniz");
        Scanner input = new Scanner(System.in);


        int yas = input.nextInt();
        if (yas < 0) {
            try {
                throw new IllegalArgumentException("yas sifirdan kucuk olamaz");
            } catch (IllegalArgumentException e){
                System.out.println("yas negatif olmamaliydi");
            }
        } else {

            System.out.println(yas);
        }

        // throw  keyword bir metodun bodysinde istedigim yerde istedigim sekilde sartta istedigim kadar exception atarim

        // throw dan sonra exception class tan bir obje olusturulur
        // konstraktirin icine istedogon mesaji yaz

    }
}
