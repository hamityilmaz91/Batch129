package Genel_deneme;

public abstract class AB  {

    public  abstract void toplama();

    public  int cikarma(){

        int a =4;
        toplama();
        return  a;

    }
    // bir metod ayni zamanda hem static hem abstrackt olamaz.
    // bu da demek oluyorki main metod icerisnden abstrackt metoda gidemezsin.
    // static metodlar override edilemeezler.

    public static void main(String[] args) {

            AB obj = new ABnincocugu() ;
        System.out.println(obj.cikarma());
    }


}
