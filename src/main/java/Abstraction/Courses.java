package Abstraction;

public abstract class Courses {



    public abstract void math();
    // bazen biz metod olustururken badisine hicbirsey yazmak istemeyiz.
  //  cunku yazdigimiz bazan  sey hicbir klass taraafindan kullanilmaya bilir
    // badisi olmayan metodlara da abstract metodlar denir .

    // badisi olmayan metodu (Abstrakt )child klaslar kullanmak zorundadirlar
    //  abstrakt metodlar child classlar tarafindan overriding edilmek zorundalardir
    //override edildikten sonra body eklenmelidir
    //eger parentta abstrakt bir metod varsa ,onu child claslara override etmezsek app  hata veriri
    // app olustururken kendimize bazi seyleri farz kilmis oluyoruz
    // abstarkt metodlar abstrakt  classlarda olur . BU SARTTIR

    public void art(){
        System.out.println("paint");
    }

}
