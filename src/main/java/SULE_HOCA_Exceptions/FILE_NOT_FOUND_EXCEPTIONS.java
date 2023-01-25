package SULE_HOCA_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FILE_NOT_FOUND_EXCEPTIONS {

    public static void main(String[] args) {

        //Compile time exception soyle olacak :: bir tane text file olacak . O text file a ulasacaz
        // text file a git. orda yazilan seyi konsola aktar

        // applicationlarda bir cok defa file lara ulasiriz. Text file a ulasitiz. excell file a ulasiriy.csv file ulasiriz

        // Dosyalara ulasmak icin kullanilan klass. Scanner kullaniciya ulasmak icin. FileinputStream de  dosyalra ulasmak icin
        //konsola biseyler yazdirma hem input hem out put oluyor. console application in disidir
        // bu konstraktira parametre eklenmeli . Parametrede alinacak dosyanin adresi olacak


        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\SULE_HOCA_Exceptions\\File01.txt");
            // fis objesi artik text

            int k=0;
            while ((k =fis.read())!=0){                                  //okudugun karakterin ascii degerini k ya koy

                System.out.print((char)k);
            }


            // burada obje olusturup direkt deger assign ettik


        } catch (FileNotFoundException e) {
            System.out.println("path is wrong or the file doenst exist");
        } catch (IOException e) {
            System.out.println("cin alfabesi var");
        }

        //Simdi poyitif senaryoya geciyoruz. Dosyaya ulastim ve okuyacam. Yani exception atmadi. Bu exception benim
        //        urettigim bir exceptinon  degil , buna dikkat
        // ya adres yanlissa ya da adres yoksa .


    }
}
