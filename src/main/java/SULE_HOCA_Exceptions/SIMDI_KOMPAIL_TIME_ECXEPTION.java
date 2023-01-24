package SULE_HOCA_Exceptions;

import java.io.FileInputStream; /// i o    input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class SIMDI_KOMPAIL_TIME_ECXEPTION {

    // text file olusturacaz. yazdigim kodla file a gidecem .Text file la gidip  onu okuyacaz. yani konsola yazdiracak.
    public static void main(String[] args) {

        int m =0;

        FileInputStream fis;

        {
            try {
                fis = new FileInputStream("src\\main\\java\\SULE_HOCA_Exceptions\\File01.txt");

                int k = 0;
                while ((k = fis. read()) != -1) {

                    System.out.print((char) k);
                }


            } catch (IOException e) {
                System.out.println("path is wrong or the file doesnt exist");
            }
        }

        // ya verdigin adres yanlissa ve adres  yoksa


    }

}
