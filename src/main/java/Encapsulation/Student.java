package Encapsulation;

public class Student{

public  int a = 12;
  private String stdId= "AC123";

   // kapsulumuz class oluyor . datamizi onun icine saklamis oluyoruz. kapsulun disina ciktigimizda data yi
  // goremezsiniz. goremedigin seye mudahale edemezsin

   // calisirken dikkatimiz dagilmaz

   // ama bazan saklanmis datayi okumaya ihtiyacimiz olabilir
   // java esnektir . Bu durumlar icin bize firsat saglar
   // Bunu nasil okuruz??

//  class  scobunda  herhangi bir degisken tanimli ise eger
  // generate dedigimzde getter ve setter geliyor

  public String getStdId() {
    return stdId;
  }
// Bu metod degiskeni vermiyor  yalniz. degiskenin degerini veriyor
  // aslinda kopyasini veriyor gibi bisey

// simdi bu getter bize  ogrenci id sini return ediyor .
// Yani okumamizi sagliyor
//  #################################////

  // GET METODLAR ENKAPSULE EDILMIS DATAYI OKUMAMIZA YARAR:
  //GET METODLAR HER ZAMAN PUBLIC OLUR : YANI HOCANIN TECRUBESI
  // GET METODLARIN RETURN TYPE I  VARIABLE IN
  // DATA TIPI ILE AYNI OLUR

  //##########################################
  // encapsulation yapilan datalarin degeri degistirilebilir mi?

  // get okumak icin
  // set degistirmek icindir


  public void setStdId(String stdId) {
    this.stdId = stdId;
    // set metodlar public olurlar
    //set metodlar encapsule edilmis datalarin degerlerini
   // degistirmemize yarar. ama bu degisiklikler sadece obje uzerinde olurlar
    // set metodlarin return type i her zaman void olur .
    // set metodlar variable ile ayni  parametre kullanirlar
  }


  // objeye git objeden bak  demek objeye yapisik gelen
  // nesneleri gor ve degisiklik yapacaksan
  //

/////////// TEK OBJE OLUSTUR DEGISTIR DEGISTIR KULLAN /////////////////////
  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }
}


