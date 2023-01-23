package Bireysel____Denemeler;

public class Market_programi_konstraktir {

        String sonkullanmatarihi= "bugun";


    ////Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
    //    //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.


    @Override
    public String toString() {
        return "Market_programi_konstraktir{" +
                "sonkullanmatarihi='" + sonkullanmatarihi + '\'' +
                '}';
    }

    public Market_programi_konstraktir(String urunadi, int urunfiyati) {

        System.out.println("urun adi = "+urunadi);
        System.out.println("urun fiyati = "+ urunfiyati);



    }


}
