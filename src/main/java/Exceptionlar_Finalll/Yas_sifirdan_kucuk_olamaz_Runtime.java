package Exceptionlar_Finalll;


// Bu exception Clasi runtime exception clasi olarak tanimlandi. Bundan  dolayi
// throw dan sonra bu class"(Yas_sifirdan_kucuk_olamaz_Runtime)"  exception atinca compile time erroru almayacam.
// Bundan dolayi  metod signatur da throwS  kelimesine ihtiyacim yok. (Yazmamin hicbir anlami yok )
//Exception i attigim yerde (o kod satirini )direkt try catch ile  handl  edebilirim.

public class Yas_sifirdan_kucuk_olamaz_Runtime extends RuntimeException{

    Yas_sifirdan_kucuk_olamaz_Runtime(String mesaj){

        super(mesaj);
    }


    // Kendimize ozel runtime time ecxeption clasi tanimlarken sablon bu sekilde oluyor .
// clasa konstaraktir koyup onu Exception cocugu yapiyoruz
}
