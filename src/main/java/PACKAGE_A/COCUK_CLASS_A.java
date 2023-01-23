package PACKAGE_A;


import PACKAGE_B.BABA_CLASS_B;

public class COCUK_CLASS_A extends BABA_CLASS_A {

    public static int public_static_cocuk_A;
    protected static int protected_static_cocuk_A;
    static int default_static_cocuk_A;
    private static int private_static_cocuk_A;



    public  int public_nonstatic_cocuk_A;
    protected  int protected_nonstatic_cocuk_A;
     int default_nonstatic_cocuk_A;
    private  int private_nonstatic_cocuk_A;


    public static void public_cocukklasA_metodu(){}
    protected static void protected_cocukklasA_metodu(){}
     static void default_cocukklasA_metodu(){}
    private static void privare_cocukklasA_metodu(){}

    public static void public_nonstatic_cocukklasA_metodu(){}
    protected  void protected_nonstatic_cocukklasA_metodu(){}
     void default_nonstatic_cocukklasA_metodu(){}
    private  void privare_nonstatic_cocukklasA_metodu(){}


    public static void main(String[] args) {


        public_nonstatic_cocukklasA_metodu();
// cocuk babanin genlerini tasiyacak(babanin metodlarini gorecek


           BABA_CLASS_A obje = new COCUK_CLASS_A();




    }







        // önce inherites olmadan cocuktan  baba  nin  icerisine bak   .....
        // sonra inhertens ,, baba ile bag kur    babanin icerisine bak  birsey degisiyor mu

        //iki class haberlesiyor ve ayni package ta inheretens  iki klasla sinirli kalirsa extra kazani   var mi ?

        // sonra babayi dede ile  birlestir   cocuktan babaya bak birsey degisiyor mu =



        //  buradaki cocuktan   diger package taki cocuga bak
        //  bbradaki cocuktan diger package taki babaya bak
        // diger package taki cocuk ile babayi bagla . diger package taki cocuga bak
        // diger paykage taki babayi dedeye bagla diger payckage taki cocuktan bak





}
