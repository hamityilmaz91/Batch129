package Exceptions_Bireysel;

public class Number_Format_exceptions_Runtime {


    // exceptionslari metodlarda atsin . throw exceptions desin.
    // simdi yazacaklarim run time exceptions olsun


    public static void main(String[] args) {

        String isim = "12a82 ";


        stringdensayieldeetme(isim);

    }

    private static void stringdensayieldeetme(String isim) {

        int a;
        try {
            a = Integer.parseInt(isim);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }


}
