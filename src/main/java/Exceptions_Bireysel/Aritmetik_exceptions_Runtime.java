package Exceptions_Bireysel;

public class Aritmetik_exceptions_Runtime {

    // exceptionslari metodlarda atsin . .

    // simdi yazacaklarim run time exceptions olsun

    public static void main(String[] args) {

        bolme();


    }

    private static void bolme() {

        int a = 5;
        int b = 0;
        try {
            int t = a / b;/////....................................................
        }catch (ArithmeticException e ){

            e.printStackTrace();
        }
    }


}
