package Constracters.Ikinci_soru;

public class Honda extends Car {


    public int price=10000;
    public Honda(){

          this("civic",2000);                                          // BIRINCI KONSTRAKTIRIM
        System.out.println("Honda1");
    }




    public Honda(String model,int jear){                // IKINCI KONSTRAKTIRIM
        super("Audi");
        System.out.println(model+"ve"+jear);
    }





    public static void main(String[] args) {            // MAIN METODUM

        Honda arabaobjesi = new Honda();

    }
}
