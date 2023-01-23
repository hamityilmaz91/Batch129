package SULE_HOCA_Exceptions;

public class NUMBER_FORMAT_EXCEPTIONS {

    public static void main(String[] args) {


        //compile time CTE   error : kodlarin yazimi esnasinda meydana gelen hata
        //run time error :RTE

        //  1)  NUMBER FORMAT EXCEPTOIN  .bir stringi alip int a ceviren kodu yazin
        //  1) try catch bloklari
        //  2)throw exception

        String str ="12a3";

        convert_to_strring(str);


    }//main

    private static void convert_to_strring(String str) {

        try {

            int ab = Integer.valueOf(str);

        }catch (NumberFormatException e){
            e.printStackTrace();



//            System.out.println("String ifade tamamen rakam icermeli ");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//           // System.err.println("burasi renkli");
        }
    }

        // onemli bir not :::::  bence kolay olmasi acisindan ,,exceptionlari ,,main metodda
    // metod cagrildigi zaman  ,, o metodu kiskaca almak
}
