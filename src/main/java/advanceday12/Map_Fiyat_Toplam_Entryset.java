package advanceday12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Fiyat_Toplam_Entryset {

    public static void main(String[] args) {

        /*
        bir map icerisinde verilen fiyatlarin toplamini bulan kod yazin.(for each loop kullanin)
        Map ler  ayri sey ,,setler ayri sey ,,
        her iki data tipide coklu eleman depolamak icin olusturulmustur
        setler tek data tipinde eleman barindirabiilr. ama mapler entry lerden olusur ve iki farkli data tipi barindirabilir
        set te  map te interface Yapisidir.
        interface nedir? bir clasin birden fazla parenti olmasi icin tasarlanmis yapilardir
        tamammen soyutturlar
        altlarindaki somut classlar araciligi ile nesneleri olur
        iclerinde degisken barindirabilirler ????
        3 tip set ve map vardir
        hashset,,,linkedhashset,,,treeset,,,,   hashmap,,,,treemap,,,hashtablemap,,,,,

         */

        Map<String,Double> ilkhashmap= new HashMap<>();

        ilkhashmap.put("Kemer",19.99);
        ilkhashmap.put("Gömlek",29.99);
        ilkhashmap.put("Ayakkabi",89.99);
        ilkhashmap.put("Kazak",24.99);
        ilkhashmap.put("Kravat",19.99);
        //entryset metodu ile cozumu,,,fiyat toplamlarinin

        Set<Map.Entry<String, Double>> entryset =ilkhashmap.entrySet();
        System.out.println(entryset);
        double sum =0;

        for (Map.Entry<String, Double> w : entryset) {

            sum=sum+w.getValue();
        }
        System.out.println(sum);






    }

   /* private static void valuelaritoplama(Map<String, Double> ilkhashmap) {

        ilkhashmap.values();
        double sum=0;
        for (Double w : ilkhashmap.values()) {
            sum = sum+w;
        }
        System.out.println(sum);


    }*/
}
