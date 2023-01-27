package Exceptions_Bireysel;

public class String_index_out_of_bound_runtime {

// her gordugun body siz metoda da absrakt deme. eger metod main metod icersinde ise cagirma amacli cagrilmistir

    public static void main(String[] args) {

        sinirasimimetodu();

    }

    private static void sinirasimimetodu() {

        String isim = "Sabir";


        try {
            char h = isim.charAt(9);
        }catch (StringIndexOutOfBoundsException e){

            e.printStackTrace();
        }


    }


}
