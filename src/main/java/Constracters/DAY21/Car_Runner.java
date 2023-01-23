package Constracters.DAY21;

public class Car_Runner {


   // Car car1=new Car("audi","a3",2222);  BU KOMUTU MAIN METODUN ICINDE OLUSTURMADIM: VE HATA VERMEDI
   // SIMDI BURDA CAR NESNESI OLUSMUS OLDUMU ? BELLEKTE BÖYLE BIR YER AYRILDIMI ??
    //YOKSA MAIN ICINDE CALISINCA MI NESNE OLUSMUS OLUYOR
 //  BU BENCE SU ANDA  PUBLIC STATIC INT A =5 ;  GIBI BISEY
    //        O ZAMAN AYNI ZAMANDA BU OJBE  BIR KLAS VARIBALE I OLUYOR

    public static void main(String[] args) {

        Car obje =new Car("honda ","civic",2022);

        System.out.println(obje);
        Car obje2 = new Car("sahin");


        //  Ayni klas icersinde 2 ayri konstraktir var diyelim
        // bu iki konstraktirdan ayri ayri obje uretiyoruz diyelim
        // her iki obje uzerinden gorebilecegim ve ulasabilecegim hersey aynidir
        // metod ve degiskenleri kastederek konusyuyorum
        // iki obje birbirinden farkli eyw ama bir objeden bir class degiskenine ulasiyorsam
        //digerinden de ulasiyorum.  "." koyunca ayni seyleri gorurum yani
    }



}


