package SSG.Varargs;

public class Birinci_soru {
    public static void main(String[] args) {

        // 3 sayiyi toplayan metod olusturun

        int a;
        int b;
        int c;
        int d = 3;
        int s = 37;
        int k = 333;

        System.out.println(toplamametodu(2, 3, 5, d, s, k));

    }//Main metodun


    public static int toplamametodu(int... arr) {

        int toplam = 0;

        for (int i : arr) {
            toplam = toplam + i;

        }
        System.out.println(arr[2]);
       int m = arr[6];

        return toplam;
    }


    //  Varargslar bildigimiz duz arrayler gibi calisirlar

}
