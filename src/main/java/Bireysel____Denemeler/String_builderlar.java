package Bireysel____Denemeler;

public class String_builderlar {

    //mutable lardir . YAni degistirilebilirler . yeni bir deger deger atanica yanin konkat
    //uygulaninca yeni bir konteynir acmaz.var olan konteyniri degistiti.



    // ama stringlerde her string icnn yeni konteynir acilir
    // stringe eleman ekledin. yni kontyexnir acilir . onda islem yapilir
    // peki ayni stringe ekleme yapip atama yaptin. yinr yeni strting aciliyor. ama eski stringin adres
    //
    // degerini gosteren refereand ynai strigfni isaret eder ve eski string garbage kollektorler tarafindan cop olur


    public static void main(String[] args) {

        StringBuilder strbld = new StringBuilder("hersey guzel olcak");

        System.out.println("strbld = " + strbld);

        strbld.append("?").append(2);
        System.out.println(strbld);
        System.out.println("strbld.length() = " + strbld.length());

        strbld.insert(4,"eeee");
        System.out.println(strbld);

    }//main

// BAZI METODLAR STRING CLASS TA VARDIR VE STRINGBUILDER CALSS TA YOKTU: MESELA SPLIT
    // EGER BU METODLARI KULLANIRSANIZ ORIJINAL DEGER DEGISMEZ :
    // CUNKU BUNLAR IMMUTUBLE CLASIN METODLARIDIR :
  //  AMA STRING BUILDERDA MESELA APPEND METODU KULLANINCA ORIJINAL DEGER DEGISTI:
}
