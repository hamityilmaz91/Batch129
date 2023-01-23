package Parenttaki_classtan_cocugun_metoduna_atlama;

public abstract class A  {
    abstract void firstMetod();
    void secondMetod(){

        System.out.println("SECOND");
        firstMetod();
    }


}
