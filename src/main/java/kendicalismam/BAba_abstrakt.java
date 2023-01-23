package kendicalismam;

public abstract class BAba_abstrakt {


    abstract void cikarma();
    public  void toplama(){

        System.out.println("ali");

        cikarma();
    }
// parenttaki asbstraklar okunmaz,,

    //asagida illa bir yerlerde overriding edilmistir
// son overriding edildigi yerdeki metod calisir . yani en asagida .
    // obje nerede olustu ise o basamaga yakin yerdeki degiskenler calsiir



}
