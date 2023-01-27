package Exceptions_Bireysel;

import java.util.Arrays;

public class Array_index_out_of_bound_runtime {

    public static void main(String[] args) {

        int arr[]=new  int[5];
        System.out.println(Arrays.toString(arr));
        araysinirasimi(arr);


    }

    private static void araysinirasimi(int arr[]) {

        try {
            int a = arr[9];
        }
        catch (ArrayIndexOutOfBoundsException e){

            e.printStackTrace();

        }

        System.out.println("catch blogu bitti ");
    }
}
