package SULE_HOCA_Exceptions;



public class NULL_POINTER_ECXEPTIONS {

    public static void main(String[] args) {

        // bir Stringte bulunan karakter sayisini veren kodu yazin

        String dua = "Ya Rabbi nimeteni bahsedecegin ana kadar sabrimizi muhafaza eyle" +
                "olmaz diye gorunen meseleleri kudretinle bir goz acma kapama aninda bize bahset";


        String dua2= null;
        try {
            System.out.println(dua2.length());
        }catch (NullPointerException e){
            System.out.println("maindeki calisti ");
        }
        get_num_of_chars(dua,dua2);

    }

    private static void get_num_of_chars(String dua,String dua2) {

        System.out.println(dua.length());
        System.out.println(dua2.length());
    }
}
