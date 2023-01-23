package Bireysel____Denemeler;

public class Static_cclasii {



          /*
      "static keyword" nedir?
      static keyword class'a baglanmis class elemanlaridir
      static class elemanlari butun Object'lerin ortak elamanidir.
      static ler uzerinde yapilan her degisiklik butun objeleri etkiler
      tum objelerde gorunur.
      static Class elemanlarina Class uzerinden ulasilir.
      */


        static int sayi1;// static variable


        int sayi2;// static olmayan variable = instance


        public static void main(String[] args) {//protokol

            System.out.println("sayi1 = " + sayi1);//0////main metod icerisinde tanimlanmamis olmasina ragmen
                                                        // yazdirabiliyoruz. Cunku static olarak tanimlanmis.
            // Main metodla class ayni classta oldugu icin(Ayni sayfada oldugu icin ) klas ismini yazmadan direkt yazdirdik.


            Static_cclasii obj1=new Static_cclasii();



            //  Scanner input=new Scanner(System.in);
            System.out.println("sayi2 "+obj1.sayi2);

            sayi1++;
            System.out.println("sayi1 = " + sayi1);//1



            obj1.sayi2++;
            System.out.println("sayi2 = " + obj1.sayi2);//1



            Static_cclasii obj2=new Static_cclasii();
            System.out.println(obj2.sayi2);//0


    }//main  metod
}
