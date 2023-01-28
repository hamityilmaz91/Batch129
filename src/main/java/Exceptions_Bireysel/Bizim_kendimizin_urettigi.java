package Exceptions_Bireysel;

public class Bizim_kendimizin_urettigi {

    public static void main(String[] args) {


        // kullanicinin javaya gore dogru ama insanlar icin cok sacma bir hata yapmasi sonucu bunu
        // exception  i throw ettiririiz. Burada hatayi biz olusturdugumuz icin kurali biz koyuyuruz
        // Kurali bizim koyuyor olmamiz demek  if kosul  meydana getirmemiz demektir


        int yas = 12;


        if (yas < 0) {
            throw  new IllegalArgumentException("sacmaladin yas sifirdan kucuk olur mu? ");

            // throwdan sonra eception classs objesi olusturduk . Mesajda konstraktirin icine yaz gitsin
        }else{
            System.out.println(yas);
        }



        // GENEL TEAMUL METOD EXCEPTION ATAR YUKARIDA MAINDE TAMIR EDILIR : THROWLAR ICIN

        // Exceptionlar app i  durdurur.
        // throw lar bundan dolayi kritik durumlarda kullanilir



//  simdi throw attirdim. Ben throw attirdim.ben exception attirdim. Eger bir program exception atioyrsa
        // tamir edilmeyze program calismaz.

        // ISIN SACMA TARAFI BURADA BASLIYOR
        // EXCEPTION ATMA IHTIMALI VAR ARTIK BIZIM APP  MIZIN: ONCE DURDURUYORUZ
        // SONRA BU DURDURDUGUMUZU TAMIR EDIYORUZ: VE BU TAMIR BIR LAZIMLIK OLUYOR
        //GEREKLILILK OLUYOR

        // PEKI BIRDEN FAZLA EXCEPTION ATMA DURUMU NASIL OLUR ???

        String isim ="12an23";

        try {
            int u = Integer.valueOf(isim);
            int c=u/0;
        }catch (NumberFormatException e){

            System.out.println(e.getMessage());
            System.out.println("***************************************************");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("***********************************************");
        }



    }
}
