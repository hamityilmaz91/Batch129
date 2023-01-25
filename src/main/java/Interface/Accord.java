package Interface;

public class Accord implements Ac,Engine,Security{


    @Override
    public void cool() {
        System.out.println("accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfectly");
    }
}
