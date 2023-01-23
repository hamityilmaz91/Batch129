package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_dizisi {
    public static void main(String[] args) {


           /*
      INTERWIEW
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....


     */

        ArrayList<Integer> fibonacci = new ArrayList<>();
        System.out.println("lutfen sayi girin");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        int i = 0;
        while (fibonacci.get((fibonacci.size() - 1)) <= sayi) {
            fibonacci.add(fibonacci.get(i + 1) + fibonacci.get(i));
            i++;


        }
        System.out.println(fibonacci);

        if(fibonacci.get(fibonacci.size()-1)>sayi){
            fibonacci.remove(fibonacci.size()-1);




        }
        System.out.println(fibonacci);
    }//maon
}
