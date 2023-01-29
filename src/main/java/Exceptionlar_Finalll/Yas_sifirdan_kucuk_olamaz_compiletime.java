package Exceptionlar_Finalll;


// Bu exception Clasi compile time  exception clasi olarak tanimlandi. Bundan dolayi
// throw dan sonra bu class ("Yas_sifirdan_kucuk_olamaz_compiletime")  exception atinca compile time erroru alacagim.
// Yani java kizaracak.
// Bundan dolayi  metod signatur da throwS  kelimesine ihtiyacim var. (Kullanabilirim ama zorunlu degil. Yazarsam anlami var )
//Exception i attigim yerde (o kod satirini )direkt try catch ile de   handl  edebilirim.O zaman compile time hata giderdi


public class Yas_sifirdan_kucuk_olamaz_compiletime extends Exception{

    Yas_sifirdan_kucuk_olamaz_compiletime(String mesaj){

        super(mesaj);
    }
}

// Kendimize ozel compile time ecxeption clasi tanimlarken sablon bu sekilde oluyor .
// clasa konstaraktir koyup onu Exception cocugu yapiyoruz