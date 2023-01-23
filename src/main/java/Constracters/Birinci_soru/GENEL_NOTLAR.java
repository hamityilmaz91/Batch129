package Constracters.Birinci_soru;

public class GENEL_NOTLAR {

    // her clas en az  bir tane konstraktir icerir.
    // ust sinir sinirlamasi yoktur
    // eger clas icinde aciktan gorunmuyorsa yine de var kabul edilir . Bunu objeckt clastan cekiyor demektir .
    // konstraktirlarin yazim formulu

    // access modifier+ class adi +()+{}==> default konstraktir yazimi.
    //    #######################önemli bilgi###########################
 //   KONSTRAKTIR ISMI CLASS ISMI ILE AYNI OLMAK ZORUNDADIR AMA BU ICINDE BULUNDUGU
  //  CLASS ISMI ILE AYNI OLMAK ZORUNDADIR ANLAMINA GELMIYOR
   // ####################################################################
    // Inherits durumu varsa klaslar arasinda zincirleme konstraktir calismasi  vardir  deriz.

    // Gorunmeyen default konstraktir icerisinde görünmeyen  default olan bir sey daha varki onlarda
    //  this()  ve super()  dir . BUnlarin bir ismi yokturdur. isleri bir usteki veya kendi icindeki konstraktirlar
    //  arasi yol tayinidir


    // Baska bir package tan bir class  kullanmadikca  birsey IMPORT veya EXPORT edilmiyor


    //  BIR CLASS  CALISTIGINDA BU DEMEK OLMUYORKI  CLASSS ICERISINDEKI  KONSTRAKTIRLAR DIREKT CALISIYOR *
    // KONSTRAKTIRLAR BIR NESNE OLUSSACAGI ZAMAN CALISIRLAR : UNUTULMAMALIDIR :

    // kod okurken main metodu bulmaliyiz ilk once classta
    // kod okurken klasta hic konstraktir yoksa default konstraktir vardir  de gec. eger diger parentlarda da
    // gorunmuyorsa default konstraktir serisi var de ve default konstraktirlar bisey uretmezler
    // yani ekstra bisey uretmezler:::DUZ NESNE URETEBILIR ;PARAMETRESIZ


    //                             SORU .... BIR CLASS ICERISINDE BASKA  BIR  KONSTRAKTIR KULLANANBILIR MIYIM ???


    //  CHILD  daki  konstraktir calisitigi zaman  parents  a gidiyor . parentstaki konstraktir calisiyor. Alt siniflardaki
    // konstraktirlarda calisiyor . Fakat  DIKKAT   Parent claslarrdaki sadece  konstraktirlar calisiyor .
    // Yani ilk bu  konstraktir  zinciri bütün halinde  calisir  ve zincir bitene kadar baska bisey calismaz.
    // Demek istiyorum ki java yukardan asagi calisiyor
    //evet  AMA  Parent klastaki konstraktir okuduktan sonra parent clastaki baska komutlari okumuyor .
    // Okusaydi ben ikinci sout u görurdum.


    // java Clasi okumaya static blok yoksa eger main metoddan  baslar .
    // main metod icerisinde ben konstraktirlari calistiririm istersem .Yoksa sönük bir sekilde orda kalir .okunmay yani

    //Ve son olarak hangi konstraktirin calisacegina ben karar veririm.(PARAMETRELER  ARACILIGI ILE YAPARIM BUNU ).
    // Bunuda this ve super komutlari  ile yaparim.


    //  Super (Parent)  Classlarda  main metod olmadan konstraktirlar calisabilir mi ??????????????
    // cevap---------EVET  CALISABILIRLER

    // ONEMLI  EGER BIR KONSTRAKTIRIN SALTERI ACILDIYSA O CALISIR : BURADAN SU SONUC CIKIYOR
    // BIR CLASS ICERSINDE BIRDEN FAZLA KONSTRAKTIR CALISABILIR

    // SUPER()  IN YERI SABITTIR;  ASAGILARDA YAZILAMAZ;;AYNI KURAL
    //  THIS()   IN YERI SABITTIR. ASAGILARDA YAZILAMAZ,,


    // ONEMLIIII     ::::  BIR KONSTRAKTIR ICERISNDE SUPER VE THIS IFADELERI BIR KERE KULLANILABILIR
    // BAK BIR CLASS ICERISINDE DEMIYORUMM: BIR CLASS ICERISNDE KONSTRAKTIR SAYISI KADAR OLABILIRLER


    //  CONSTRAKTIRLARIN ICERISINDEN  ICINDE BULUNDUGUMUZ CLASSIN VARIABLE LARINI CAGIRABILIRIZ:
    // BUNUN ICIN "this. " yazip nokta koyuyoruz (parantezsiz)

    //  CONSTRAKTIRLARIN ICERISINDEN  PARENT  CLASSIN VARIABLE LARINI DA CAGIRABILIRIZ:
    // BUNUN icinde "super."  PARANTEZSIZ YAZARIZ


    //  CONSTRAKTIRLARIN ICERISINDEN  ICINDE BULUNDUGUMUZ CLASSIN metodlarini LARINI CAGIRABILIRIZ:
    // BUNUN ICIN "this. " yazip nokta koyuyoruz (parantezsiz)

    //  CONSTRAKTIRLARIN ICERISINDEN  PARENT  CLASSIN metodlarini LARINI DA CAGIRABILIRIZ:
    // BUNUN icinde "super."  PARANTEZSIZ YAZARIZ


//  OBJE OLUSTURULURKEN EN BASTAKI CLASS ISMI VAR YA
    // ISTE O DATA TIPI DEMEKTIR(NON PRIMITIVE DATA TIPI OLUYOR ) :
    //EGER BEN  BU DATA TIPINDEN BIR OBJE OLUSTURDU ISEMMMMM;;; BU OBJEDEKI VARIABLE  BU DATA TIPINDE
    //       ARAMAM LAZIM

    // BEN NESNE UZERINDEN  2 SEY GOREBILIRIM : VARIABLE VE METOD
    //NOKTA KOYUNCA ZATEN METOD YA DA VARIABLE OLDUGUNU  JAVA SOYLUYOR

    // NESNEDE  VARIABLLAERI GORURUM PEKI BU GORDUGUM VARIABLE NERDE????????
    //


//    VARIABLEEEEEEEEEEEEEEE           CAGIRMAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    //OLUSTURULAN OBJELER KULLANILARAK VARIABLLARA NASIL ULASILIR ?????
    //ADIMLAR :
    //1- objede veriableri gooruyorsam bu bir yerde var demektir. illa karsina cikacaktir
    //onemli olan nerede araman gerektigini bilmendir
    // bunu icin baslangic noktan variable in data tipidir . yani hangi klastan olustugudur
    // BULDUNSA  DEGERI O DUR  ::: BULAMADIYSAN BULANA KADAR DEVAM ET : HIYERARSIYE UYARAK
    //KATLARI CIK
    //       BULDUGUN KATTA DUR  VE DEGERI BUDUR DE


    //TEKRARDAN  DUSUNME ALGORITMA SIRASI
    // 1-- VARIABLA HANGI OBJEDEN BAKILIYOR
    //2-- BU OBJE  HANGI DATA TIPINDEN YANI HANGI KLASTAN URETILIYOR
    //3-- O KLASTA BU OBJEYI ARAYACAKSIN:

    //VARIABLE A  NEREDEN BAKIYORUM:;;;; OBJEDEN ;;;BAKTIGIM YER (OBJE )NEREYE AIT
    // BURADAN CLASA ULASIYORUM: BULUNDUGUM YERDE ARAMAYA BASLIYORUM: YUKARI CIKARAK GIDIYORUM
    // EGER BULAMAZSAN COMP TIME ERROR VERIR


    //   METOOOOOOOOOOOOOODDDDDDDDDDDDDDDDDD CAGIRMAAAAAAAAAAAAAAAAAA

    // METODA NEREDEN BAKIYORUM: BAKTIGIM YER NEREYE AIT ????  BU SEFER KONSTRAKTIR NEREYE AIT


    // OZETTTTTTTTTTTTTTTTTTTT

    // VARIABLA DA  KLASSS NEREYE AIT      SU KLASA AIT      BASLA ARAMAYA

    //       METODDA KOSTRAKTIR NEREYE AIT   SU KLASA AIT     BASLA ARAMAYA


    // BIR  OBJE OLUSTURURKEN DATA TIPI VE KONSTRAKTIR FARKLI OLABILIR
    //  AMA AMA AMA   DATA TIPI >= KONSTRAKTIR OLMALI


//ONEMLIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII

//INHERITENS YAPISINDA KONSTRAKTIR ZINCIRININ UYUMU MAIN METODSUZ KONTROL EDILIR
//MAIN METODSUZ KONSTRAKTIRLAR CALISMAZ AMAAAA ARALARINDAKI UYUMMMM   YANI BIRBIRLERINE GIDIP GELECEK
//HABERLESME YOLLARI  DEFAULT SUPER ()  LER DOGRU INSA EDILIP EDILMEDIGI MAIN METODSUZ YAZIM ESNASINDA KONRTOL
    //      EDILIR VE YANLISLIK VARSA HATA ALINIR
    //        YANI MAINSIZ URETIM YOK    : YOLLAR CALISMIYOR
    //      AMA YOLLARIN DUZGUN DOSENIP DOSENMEDIGI MAINSIZ KONTROL EDILIYOR



 //   #######################################  degisik bir bilgi ########################################

  //  oncelikle konstraktirlar dan nesneleri olusturuyoruz.
  //      nesneyi gormek istedigimizde generate to String diyoruz.
   //     bu sekilde konstraktiri yazdirmis olmuyoruz. Klasi yazdirmis oluyoruz.
  //      SIMDI KRITIK NOKTA NESNE UZERINDEN KLASS DEGISKENINE ULASTIM PRIVAT OLANLAR HARIC
   // AMA GENERATE KOMUTU NESNEYI YANI KLASI YAZDIRDIGI ICIN ;;EGER BIZ DIKKATLI OLMAZSAK
   //         DEFAULT OLARAK TOSTRING ICERISDINDE HERSEYYYYY GORULUYOR :YANI PRIVAT DEGISKENI DE
   //         YAZDIRIRSAK O DA GUN YUZUNE CIKMIS OLUYOR NESNEYI YAZDIRARAK:
  //  HANI BIR NEVI ENKAPSULATION MI OLDU BU IS O ZAMAN ????????

//######################### SImdi bir classta birden fazla konstraktir varsa main  metodda hangisine gidecegini soylememiz lazim
 //   ayni metodoverloadinglerdeki gibi


}