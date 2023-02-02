package Hastane_Projesi_Kucuk_Mentor;

import java.util.Scanner;

public class Obje_olusturup_objeyi_transfer_etmek {

    public static void main(String[] args) {

        baslangic();
    }

    public static void baslangic() {
        System.out.println("yeni personel eklemek icin 1 i tuslayin \n" +
                "personellistesinden adam silmek icin 2 yi tuslayin\n" +
                "cikmak icin 3 e basin\n" +
                "personel listesini gormek icin 4 e basin  ");

        // System.out.println("yeni personel  bilgileri ::::muhendis Ahmet yilmaz");
        //ystem.out.println(" silinecek personel bilgileri ");
        Scanner input = new Scanner(System.in);
        int durum = input.nextInt();


        switch (durum) {

            case 1:
                personelekle();
                baslangic();
                break;
            case 2:
                personelsil();
                baslangic();
                break;
            case 3:
                break;
            case 4:
                personellistesiyazdir();
                break;
            default:
                System.out.println("yanlis giris yaptiniz");
                baslangic();
                break;

        }


    }

    private static void personellistesiyazdir() {

        if (Veritabani.personelisimlistesi.size() < 1) {
            System.out.println("peresonel listesi bombos.Henuz kadrolasamadik");
        } else {
            for (int i = 0; i < Veritabani.personelisimlistesi.size(); i++) {

                System.out.printf("%-9s  %-9s  %-9s", Veritabani.personellistesi.get(i).getIsim(),
                        Veritabani.personellistesi.get(i).getSoyisim(), Veritabani.personellistesi.get(i).getMeslek());
                ;
                System.out.println();

            }

            baslangic();
        }
    }

    private static void personelsil() {


    }

    private static void personelekle() {

        Meslek meslek_objsi = new Meslek();
        System.out.println("lutfen eklenecek peresonelin bilgilerini girin.");
        Scanner input = new Scanner(System.in);
        System.out.println("ismi ?");
        meslek_objsi.setIsim(input.next());
        System.out.println("soyismi ?");
        meslek_objsi.setSoyisim(input.next());

        System.out.println("meslegi ?");
        meslek_objsi.setMeslek(input.next());
        Veritabani.personellistesi.add(meslek_objsi);
        Veritabani.personelisimlistesi.add(meslek_objsi.getIsim());
        Veritabani.personelsoyisimlistesi.add(meslek_objsi.getSoyisim());
        Veritabani.personelmeslek.add(meslek_objsi.getMeslek());

        baslangic();

    }


}
