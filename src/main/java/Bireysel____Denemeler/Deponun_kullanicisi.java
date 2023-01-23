package Bireysel____Denemeler;

public class Deponun_kullanicisi {


        public static void main(String[] args) {

            System.out.println(Static_depo.okulIsmi);//Emre Okullari

            System.out.println("\n\n");

            Static_depo obj1 = new Static_depo();

            System.out.println(obj1.ogrenciGul);//Gul Gecer

            System.out.println("\n\n");

            System.out.println("burada depo clasinin statigini degistiriyoruz");
            Static_depo.okulIsmi=" Mine Okullari";
            System.out.println("Static_depo.okulIsmi = " + Static_depo.okulIsmi);//Mine Okullari

            Static_depo obj2 = new Static_depo();
            obj2.ogrenciGul="Zeynep Karagol";
            System.out.println("obj2den ogrenci "+obj2.ogrenciGul);// Zeynep Karagol
            System.out.println("obj1den ogrenci "+obj1.ogrenciGul);//Gul Gecer


            System.out.println(obj2.okulIsmi);// Mine Okullari
            // static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
            //static variable'lara class ismi kullanarak ulasilmalidir


        }













    }//Main metod
//Class
