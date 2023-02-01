package Hastane_bireysel;

import java.util.Scanner;

public class Doktor_islem_clasii {

    public static void main(String[] args) {
        BaslangicMenusu();
        Doktorislem();
    }


    //***************************************************************************************************
    private static void BaslangicMenusu() {

        System.out.printf("%-12s %-12s", "", "Hastahanemiz Bilgi Sistemine Hosgeldiniz\n");
        System.out.printf("%-12s %-12s", "", "Yapmak istediginiz islemi seciniz\n");
        System.out.printf("%-12s %-12s", "", "Doktor  Menusu icin 1 e basin\n");
        System.out.printf("%-12s %-12s", "", "Hasta Menusu icin 2 ye basin\n");
        System.out.printf("%-12s %-12s", "", "Cikis icin 3 e basin\n");
        Scanner input = new Scanner(System.in);







        int karar = input.nextInt();
        switch (karar) {
            case 1:
                Doktorislem();
                BaslangicMenusu();
                break;
            case 2:
                System.out.println("hasta menusu girileeck\n");
                BaslangicMenusu();

                break;
            case 3:
                System.out.println("iyi gunler dileriz\n");
                break;
            default:
                System.out.println("yanlis tusladiniz. Lutfen tekrar deneyin\n");
                BaslangicMenusu();
                break;
        }
    }

    // ***********************************************************************************************************+
    public static void Doktorislem() {


        System.out.printf("%-12s%-12s", "", "Doktor eklemek icin 1 e basiniz\n");
        System.out.printf("%-12s%-12s", "", "Doktor listemizi gormek icin 2 ye basiniz \n");
        System.out.printf("%-12s%-12s", "", "Unvandan doktor bulmak icin 3 e basiniz\n");
        System.out.printf("%-12s%-12s", "", "Doktor silmek icin 4 e basiniz\n");
        System.out.printf("%-12s%-12s", "", "Ana menuye donmek icin 5 e basiniz\n");
        System.out.printf("%-12s%-12s", "", "Menuden Cikis icin 6 ya basin\n");
        System.out.println("*****************************************************************************");

        Scanner input = new Scanner(System.in);
        int karar = input.nextInt();

        switch (karar) {
            case 1:
                DoktorEkle();
                BaslangicMenusu();
                break;
            case 2:
                Doktorlistesi();
                BaslangicMenusu();
                break;
            case 3:
                UnvandanDoktorBul();
                BaslangicMenusu();
                break;
            case 4:
                DoktorSil();
                BaslangicMenusu();
                break;
            case 5:
                BaslangicMenusu();
                break;
            case 6:
                DoktorMenusundenCikis();
                BaslangicMenusu();
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
                Doktorislem();
                break;

        }


    }// ana metod


    // ***********************************************************************************************************
    private static void DoktorMenusundenCikis() {
    }
    // ***********************************************************************************************************
// ***********************************************************************************************************

    private static void DoktorSil() {
    }

    // ***********************************************************************************************************
    private static void UnvandanDoktorBul() {
    }

    // ***********************************************************************************************************
    private static void Doktorlistesi() {

        Veri_Bankasi_2.doctorIsimleri();

        for(int i=0;i<Veri_Bankasi_2.doctorIsimleri.size()-1;i++){

            System.out.printf("%-9s %-9s %-9s %-9s %-9s","Dr.",Veri_Bankasi_2.doctorIsimleri.get(i),Veri_Bankasi_2.doctorSoyIsimleri.get(i),Veri_Bankasi_2.unvanlar.get(i),"uzmani");
            System.out.println();
        }

    }
// ***********************************************************************************************************

    private static void DoktorEkle() {

        //////////////DOKTOR CLASINDAN OBJE OLUSTURUP LISTE EKLEMEK DAHA MI PROFESYONEL OLUR???????????????????????
        /////////AKSI TAKTIRDE DOKTOR CLASININ NE MANASI KALDI ???????????


        System.out.println(" Sisteme yeni doktor eklemek  icin yetki sifreniz olmali  ");
        Scanner input = new Scanner(System.in);

        System.out.println("Eklenecek doktorun ismini giriniz");
        String yeniDoktorIsmi = input.nextLine();

        System.out.println("Eklenecek doktorun soyismini giriniz");
        String yeniDoktorSoyIsmi = input.nextLine();

        System.out.println("Eklenecek doktorun unvanini giriniz");
        String yeniDoktorUnvan = input.nextLine();
        Veri_Bankasi_2.doctorIsimleri();
        Veri_Bankasi_2.doctorSoyIsimleri.add(yeniDoktorIsmi);


        /////  OLMADI     OLMADI    OLMADI
        BaslangicMenusu();













    }//metod


}