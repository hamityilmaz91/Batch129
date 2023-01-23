package Bireysel____Denemeler;

public class Scop {


    public void herhangibi() {

        String isim = "hamit ";
        System.out.println(isim);
        yazdirmametodu(isim);
        silme();


    }

    public static void yazdirmametodu(String isim) {
        System.out.println(isim);
    }


    public void silme() {
        String isim2 = "ali ";
        yazdirmametodu(isim2);
    }


}
