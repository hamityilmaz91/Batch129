package Genel_deneme;

public class Cest extends Cc01{
    int b = 10;
    Cest(){

        b=super.b;
    }

    @Override
    void getNumber(int x, int y) {
        int i= x*y+b;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Cest sub = new Cest();

        sub.getNumber(7,3);
    }
}
