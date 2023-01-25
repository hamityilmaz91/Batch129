package Genel_deneme;

public class Test extends Ab01{

    public void degisim(){

        this.b=23;

    }

    public static void main(String[] args) {

        Test obj = new Test();

        System.out.println(obj.b);
        obj.degisim();
        System.out.println(obj.b);

    }


}
