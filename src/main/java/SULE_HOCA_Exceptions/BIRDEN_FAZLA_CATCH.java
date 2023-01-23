package SULE_HOCA_Exceptions;

public class BIRDEN_FAZLA_CATCH {
    public static void main(String[] args) {


        // Stringi integer a ceviriniz ve karakter sayisina bölünüz

        String isim = " Ya sabir ";

        double d = ikilimetod(null);

    }

    private static double ikilimetod(String isim) {


        int lenngt = 0;// null pointer
        try {
            lenngt = isim.length();
        } catch (Exception e) {
           e.printStackTrace();
        }

        try {
            int lenngt1 = isim.length();// numberformat
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int lenngt2 = isim.length();
            System.out.println("aradaki##############################################################");// aritmetik exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }

        int i =0;
        double sonuc=0;
        try {
            sonuc=i/lenngt;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return sonuc;
    }

}