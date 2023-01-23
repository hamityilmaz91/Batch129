package SSG.Varargs;

public class ucuncu_soru {

    // kac tane il ismi verilirse verilsin iclerinden en uzun olani yazdiran metodu   yaziniz


    public static void main(String[] args) {

        String sehir1 = "Maras";
        String sehir2 = "Mardfdsfsdfdsas";
        String sehir3 = "Marasfsdfsfsfdsfd";
        String sehir4 = "Marasfsf";
        String sehir5 = "Marasfsfs";
        String sehir6 = "Mffsfarfsfdas";
        enuzunisim(sehir1, sehir2, sehir3, sehir4, sehir5, sehir6);


    }

    private static void enuzunisim(String... m) {

        String uzunluk = "";

        for (String w : m) {

            if (w.length() > uzunluk.length()) {
                uzunluk = w;
            }

        }
        System.out.println(uzunluk);
    }
}