package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.Arrays;

public class Metod_olusturma_ornekleri {


    public static void main(String[] args) {

//
//
//      /*                      bir array oluşturalım
//		  sonra array elemanlarını  elemanDegistir methodu yazıp,
//		  orada
//		 array elemanlarından bazılarını degiştirelim.
//		 method void olsun.
//		 main methoda döndükten sonra yeniden array'i yazdıralım
//		 */
//
//        int arr [] ={2,4,6,8,0,23,46,687,234};
//
//
//        System.out.println("metoddan once ");
//        System.out.println(Arrays.toString(arr));
//
//
//
//        elemandegistirmetodu( arr);
//
//
//
//        System.out.println("metoddan sonra ");
//        System.out.println(Arrays.toString(elemandegistirmetodu(arr)));
//
//        System.out.println(Arrays.toString(arr));
//
//
//    }//main
//
//    private static int [] elemandegistirmetodu(int arr[]) {
//
//        //System.out.println(Arrays.toString(arr));//  {2,4,6,8,0,23,46,687,234};
//
//        arr[3]=88888;
//        arr[7]=88888;
//        return arr;


        int arr[]=new int[4];
         arr[0]=5;
         arr[1]=5;
         arr[2]=5;
         arr[3]=5;
        System.out.println("ilk arr");
        System.out.println(Arrays.toString(arr));
        arr= new int[4];
        System.out.println("ikinci arr.Ayni isimde yeni bir arr olusturabilirsin ayni veya farkli boyuuta");
        //bu durumda elemanlar sifirlanir.
        // arraylerin birbirine arrray olarak assigne edeilmesi mumkun degil. Bir arrayi boyutsal olarak degistirmek
        //ayni isimde yeni array tanimlamakla mumkundur
        //////////+++++++ ilginc bilgi . bir listi diger liste direkt olarak assign edebilirsin.
        // hem eleman olarak hem boyut olarak direkt atanabilir
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> dort_boyutludizi=new ArrayList<>();
        dort_boyutludizi.add(4);
        dort_boyutludizi.add(3);
        dort_boyutludizi.add(32);
        dort_boyutludizi.add(324);

        System.out.println(dort_boyutludizi);
        ArrayList<Integer> ucboyutlu_dizi =new ArrayList<>();
        ucboyutlu_dizi.add(55);
        ucboyutlu_dizi.add(55);


dort_boyutludizi=ucboyutlu_dizi;
        System.out.println(dort_boyutludizi);

    }
}//class
