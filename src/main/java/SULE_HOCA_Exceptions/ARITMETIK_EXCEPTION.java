package SULE_HOCA_Exceptions;



public class ARITMETIK_EXCEPTION {

    public static void main(String[] args) {



        divide(6,0);

    }

    private static void divide(int i, int i1) {


        try {
            System.out.println(i / i1);
        }catch (ArithmeticException e){

            e.printStackTrace();
        }

    }
}
