package Metodoverriding;

public class Sonkez {

    public static void main(String[] args) {


    }

    public int toplama(int a, int b) {
                                               //simdi bu metodu OVERLOADING yapicam
        return a + b;
    }
                                            // Bu su anda kesinlikle overloading
    public double  toplama(int a,int b,int c){
                                            // return type eger kabul ediyorsa sorun yok.
        return a+b+c;
}

}





