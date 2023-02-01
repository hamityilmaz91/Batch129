package Exceptions_Bireysel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_miss_matching_Exceptions extends Throwable {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int a = 5;
        try {
            a = input.nextInt();

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(a);


        }


    }
}
