package Exceptions_Bireysel;

public class TypeCastExceptions {


    public static void main(String[] args) {



        // Buyugu kucuge koymak icin bizim israr etmemiz gerekiyordu. Onu unutursak eger?
        // Java burada compile time exception verdi  BU Primitive data tipleri icin yasandi.
        // ve burda exception try catch kabul etmedi.expliixt narrowingi direlk kabul etti bunu exception olarak yorumlamadi


        int a=12;
        double b =111;

        // Simdi non Primitive data tiplerine bakalim. Non primitvlerde yani class data tiplerinde
        // buyugu kucuge koymaya calisirken compile time veriyor .Kucukten buyuge sorun yok

        //Class cast yaparken buyugu kucuge koymak icin explixit narrowing yapsan bile run time exception atiyor
        // Bu kismi iste primitive data tiplerinden farkli .
        //burada handli etmek gerekiyor

        Object obj = 70;
        String str = "33";
        try {
            str = (String) obj;
        }catch (ClassCastException e){
            System.out.println(e.getMessage());

        }



}
}



