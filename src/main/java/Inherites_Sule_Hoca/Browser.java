package Inherites_Sule_Hoca;

public class Browser  {




    public void get(){

        System.out.println("Browserlar web sayfasina gider ");

    }

    public void search(){
        System.out.println("Browserlar web sayfasinda arastirma yaparlar");

    }

    public void sifrekaydetme(){
        System.out.println("Browserlar istenildiginde sifreyi kaydeder");

    }

    public static void main(String[] args) {

        String adrescubugu = " her browserda adres cubugu vardir ";

        Edge edge = new Edge();
        edge.search();  //    "Edge web sayfasinda arama yapar
        edge.sifrekaydetme();//      Edge cookies leri kabul edilenlerin sifresini kaydeder"
        edge.get(); //  Browserlar web sayfasina gider



    }
}



