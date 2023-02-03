package hastane;

import java.util.Scanner;

public class Hastane_Menu {

    public  static void hastanemenu() {


        System.out.println(" ****************OA1 Hastanesine Hosgeldiniz************");
        System.out.println("Menumuzden gitmek isteginiz bolumu secin\n" +
                "Hasta Menusu icin 1 e\n" +
                "Doktor Menusu icin 2 ye basin");


        Scanner input = new Scanner(System.in);
        int karar= input.nextInt();

        switch (karar){

            case 1:
                Hastane.hastaBulMethod();

            case 2:
                System.out.println("grup 2");


        }





    }

}
