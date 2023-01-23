package SSG.Varargs;

public class Ikinci_soru {
    public static void main(String[] args) {


        // Bir kisinin isim soy isim ve adresini yazdiran bir metod olusuturun. Degerleri varargs olarak gonderin

        String isim_soyisim = "Kerim Selim";
        String adres = "almanya";
        String medeni_hal = " bekar ";

        bilgileriyazdiran(isim_soyisim, adres, medeni_hal);

//  SIMDI BIRDA YENI BIR VARAIABLE GELDIGINI VARSAYALIM : ONUDA SISTEME DAHILM  EDECEZ: METOD VARARGS OLDUGU ICIN
        // YENIDEN METOD OLUSTURMAYA GEREL   YOKTUR : SADECE MAIN METODDA  assssllliinnnndddaaaaa
        // metod overloding yapmis gibi bisey oluyoruz.

        // MUHTEMELEN YANLIS BIR IFADE AMA VARARGS LARLA DOGAL BIR METOD OVERLODUNG YAPMIS OLUYORUZ:
        // PARAMETRE SAYISI DEGINCE OVERLAODING OLUYORDU YA HANI

    }

    private static void bilgileriyazdiran(String... arr) {

        System.out.println(" ad : " + arr[0] + "\n" + "adres : " + arr[1] + "\n" + "medeni hal : " + arr[2]);

    }


}
