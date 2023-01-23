package Bireysel____Denemeler;



import java.util.ArrayList;
import java.util.Scanner;

public class Ortalamayi_gecen_ogrencisayisi {










        public static void main(String[] args) {

            // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

            Scanner input = new Scanner(System.in);

            ArrayList<Integer> ogrenci_notlari = new ArrayList<>();

            int toplam = 0;

            int ortalama;

            int index = 1;

            int sayi;
            String yeni="";
            System.out.println("Ogrencilerin notlarini girinz ve cikmak icin q ya basiniz");

            int counter = 0;

            do {

                System.out.println(index + ".ogrencinin  notunu  girinz");


                sayi = input.nextInt();
                yeni= String.valueOf(sayi);

                if (yeni.equalsIgnoreCase("q")) {

                    break;

                } else {

                    ogrenci_notlari.add(sayi);

                    index++;

                }

            } while (true);

            System.out.println(ogrenci_notlari);

            for (Integer w : ogrenci_notlari) {

                toplam = toplam + w;

            }

            ortalama = toplam / ogrenci_notlari.size();

            for (Integer w : ogrenci_notlari) {

                if (w > ortalama) {

                    counter++;

                }

            }

            System.out.println("sinifin ortalamasi = " + ortalama + "ortalamayi gecen ogrenci syisi = " + counter);

        }}
/*
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ogrenci_notlari = new ArrayList<>();
        int toplam = 0;
        int ortalama;
        int index = 1;
        int sayi;
        System.out.println("Ogrencilerin notlarini girinz ve cikmak icin q ya basiniz");
        int counter=0;

        do {

            System.out.println(index + ".ogrencinin  notunu  girinz");

            sayi = input.nextInt();

            if (String.valueOf(sayi).equalsIgnoreCase("q")) {

                break;

            }else {

                ogrenci_notlari.add(sayi);
                index++;
            }
        } while (true);

        System.out.println(ogrenci_notlari);

        for (Integer w : ogrenci_notlari) {

            toplam=toplam+w;

        }

        ortalama=toplam/ogrenci_notlari.size();

        for (Integer w : ogrenci_notlari) {

            if(w>ortalama){
                counter++;
            }

        }
        System.out.println("sinifin ortalamasi = "+ortalama +"ortalamayi gecen ogrenci syisi = "+counter);




*/
