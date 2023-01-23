package SULE_HOCA_Exceptions;

import Constracters.Anlama_sorusu.Mammal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ARRAY_INDEX_OF_BOUND_EXCEPTION {

    public static void main(String[] args) {


        // String bir arrayden verilen bir index i geri donderen kodu yazin

        String arr[] = new String[4];
        arr[0] = "ali";
        arr[1] = "ali";
        arr[2] = "ali";
        arr[3] = "ali";
        int idx = 121212;

        get_element(arr, idx);


    }

    private static String get_element(String[] arr, int idx) {
        String istenen = "";

        try {
            istenen = arr[idx];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hadi bakalim");
            e.printStackTrace();
        }


        return istenen;
    }
}
