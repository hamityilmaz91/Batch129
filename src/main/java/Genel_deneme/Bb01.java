package Genel_deneme;

public abstract class Bb01 {

    public int a =10;
    public abstract void set(int a);
    public int get(){
        return a;
    }

    public static void main(String[] args) {

        Bb01 obj = new Parent();

    }


}
