package Exceptionlar_Finalll;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_not_found_compile_time_exceptioni {

    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\Exceptionlar_Finalll\\benimtextim.txt");

            int k=0;
            while ( (k=fis.read())!=-1){

                System.out.print((char) k);
            }
        } catch (IOException e) {

            System.out.println("okumak istediginiz dosya yerinde yok");
        }


    }



}
