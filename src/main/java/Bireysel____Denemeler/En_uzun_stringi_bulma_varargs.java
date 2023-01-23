package Bireysel____Denemeler;

public class En_uzun_stringi_bulma_varargs {


    public static void main(String[] args) {

        // Kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnsdgdshjsan";
        String str5 = "Sahsanem";

        enuzunstringibulma(str5, str2, str3, str4, str1);


    }//main

    private static void enuzunstringibulma(String... str) {

        int max = Integer.MIN_VALUE;
        for (String w : str) {

            max=Math.max(w.length(),max);

        }

        for (String w : str) {

            if (w.length()==max){
                System.out.println("en uzun Kelime =  "+w);
            }

        }
    }
}//class

