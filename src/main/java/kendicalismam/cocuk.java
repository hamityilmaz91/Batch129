package kendicalismam;


import Farkli_Konstraktir.C;

public class cocuk extends BAba_abstrakt{
    @Override
    void cikarma() {
        System.out.println("veli");
    }


    public static void main(String[] args) {
        cocuk obj =new cocuk();
        obj.toplama();
    }
}
