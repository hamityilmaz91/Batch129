package Inheritens_Sonnnnnnnnn;

public class A_CLASS  extends B_CLASS {

    int ama ;
    public int  xa ;
    private  int öza;
    public void a_classin_metodu(){
    }
    public static void main(String[] args) {

//        cocugun konstraktirindan baba klas sinifin objesini olusruruyorum
//                babanin objesine baktigimda
//                baba konstraktri ile olusturdugum degiskelnlerin aynisini görüyorum
      //  yani alt klasin metodunu goremiyorum. ve degiskenlerini

        // ama ust klas sinifindan data tipi alip
        // alt klasin konstraktiri kullanilarak
        // data narrowing ile metodu gorebiliyorum ama degiskeni goremiyorum.
//
        B_CLASS obje1 = new A_CLASS();
        ((A_CLASS) obje1).ama=5;

        ((A_CLASS) obje1).a_classin_metodu();
        obje1.b_classin_metodu();
        ((A_CLASS) obje1).a_classin_metodu();






    }
}
