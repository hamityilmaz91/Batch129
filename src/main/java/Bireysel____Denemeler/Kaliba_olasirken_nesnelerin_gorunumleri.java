package Bireysel____Denemeler;

public class Kaliba_olasirken_nesnelerin_gorunumleri {


    public static void main(String[] args) {

    // static variabller   f fonksiyon olarak gozukuyor.

        System.out.println(Kalip_klass_Static_ve_nonstatic_variablar_olusturma.butcestatic);



        // SIMDI  KALIPTAKI NON STATIC NESNELERE ULASMAK ICIN   KALIPTAN OBJE OLUSTURUYORUZ

        Kalip_klass_Static_ve_nonstatic_variablar_olusturma OBJE= new Kalip_klass_Static_ve_nonstatic_variablar_olusturma();

        System.out.println(OBJE.butcedefault);
        System.out.println(OBJE.butceprotected);

        // DEFAULT VE PROTECTED oBJELERE uLASABILDIM:



    }//main
}//classs


