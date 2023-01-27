package Day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    public static void main(String[] args) {


        // linkedHashset olusturma

        LinkedHashSet<String> artist= new LinkedHashSet<>();
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Bradd");
        artist.add("Angelina");
        artist.add("Tom");// setler tekrarsiz eleman icerirler. Siz ayni elemani
        // tekrar tekrar eklerseniz java hata vermez ama tekrarli eklenen elemani sete sadece bir kere koyar

        System.out.println(artist);//[Ajda, Tom, Bradd, Angelina]
        LinkedHashSet<String> actreest = new LinkedHashSet<>();
        actreest.add("Ajda");
        actreest.add("Angelina");
        artist.removeAll(actreest);
        System.out.println(artist);



        // her zaman bizim verdigimiz siraya gore dizer

    }
}
