package Inheritence_icin_deneme_packagei;

import Bireysel____Denemeler.Karealdirma;

import java.util.Scanner;

public  class Test  {

public String studentname ;
public String jear = "2020";
static  int counter = 1000;

String studentid;


    public Test() {
        Scanner input = new Scanner(System.in);
        System.out.println(" isminizi girin");
        studentname=input.next();
        setStudentid();

    }// kostraktirin

    public static void main(String[] args) {

        Test student1 = new Test();
        System.out.println(student1.studentname+student1.studentid);

        Test student2 = new Test();
        System.out.println(student2.studentname+student2.studentid);

    }

    protected   void setStudentid(){

        counter++;
        this.studentid=jear+""+counter;
    }
}//classin
