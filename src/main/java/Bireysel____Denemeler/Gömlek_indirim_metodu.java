package Bireysel____Denemeler;

public class Gömlek_indirim_metodu {


    public static void main(String[] args) {


     /*
​
        Gomlek            = 100 TL
        Ogrenci           = -10 TL indirim =90 TL
        Gazi              = -20 TL indirim =80 TL
        Yaslilara         = -5  tL indirim =95 TL
​
       */


        int gomlek = 100;
        

        gomlekindirim("ogrenci",gomlek);
        System.out.println(gomlek);






    }//Main

    private static void gomlekindirim(String kategori, int gomlek) {


    String durum =kategori;

    switch (durum){

        case "ogrenci":
            gomlek=gomlek-10;
            System.out.println("gomlek = " + gomlek);
            break;
        case "gazi":
            gomlek=gomlek-20;
            System.out.println("gomlek = " + gomlek);
            break;
        case"yasli":
            gomlek=gomlek-5;
            System.out.println("gomlek = " + gomlek);
            break;
        default:

            gomlek=gomlek;
            System.out.println("gomlek = " + gomlek);




    }






    }//Metod





}//Class
