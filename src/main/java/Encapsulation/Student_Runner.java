package Encapsulation;

public class Student_Runner {


    public static void main(String[] args) {


        Student myStd = new Student();

        String  stdId  =  myStd.getStdId();
        System.out.println(stdId);

        myStd.setStdId("eee");
        System.out.println(myStd.getStdId());

        System.out.println(myStd.getA());
        myStd.setA(4);
        System.out.println(myStd.getA());


    }



}
