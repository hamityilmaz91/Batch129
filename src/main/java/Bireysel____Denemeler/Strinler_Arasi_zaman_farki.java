package Bireysel____Denemeler;

public class Strinler_Arasi_zaman_farki {

    public static void main(String[] args) {
        String m = "merhaba";

        long time = System.nanoTime();
        for (int i = 0; i < 1000; i++) {

            m= m+" ";
        }
        long time2 =System.nanoTime();
        System.out.println(time2-time);



        StringBuilder me= new StringBuilder("merhaba");

        long time3= System.nanoTime();
        for (int i = 0; i < 1000; i++) {

            me.append(" ");

        }
        long time4 =System.nanoTime();
        System.out.println(time4-time3);



    }







}
