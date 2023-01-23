package SULE_HOCA_Exceptions;

public class STRING_INDEX_OUT_OF_BOUND_EXCEPTION {


    public static void main(String[] args) {


        // BIR STRINGIN ISTEDIGIMIZ INDEX INDEKI DATASINI BIZE GERI VEREN KODU YAZINIZ

        String sir = "Bu uc aylarda Allahin izni ile umduklarimiza ,bugune kadar ki sabrettikleirmize kavusma ümidindeyim";
        int index = 3444;

        System.out.println(harfal(sir, index));
    }

    private static char harfal(String sir, int index) {

        char harf=' ';
        try {
             harf = sir.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("index cok buyuk");

            e.printStackTrace();

        }


        return harf;

    }//metod
}
