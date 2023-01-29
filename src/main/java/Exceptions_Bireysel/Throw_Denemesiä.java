package Exceptions_Bireysel;

public class Throw_Denemesiä {


    public static void main(String[] args) throws IllegalArgumentException {
        toplamametodu(122);
    }

    private static void toplamametodu(int i) {

        if(i>100){

            throw new IllegalArgumentException("yuzden buyuk girdin");
        }
        else{
            System.out.println(i);
        }

    }
}
