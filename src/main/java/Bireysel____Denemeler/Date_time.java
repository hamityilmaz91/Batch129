package Bireysel____Denemeler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Date_time {

    public static void main(String[] args) {


        Date mydate = new Date();
        System.out.println(mydate);   //     Thu Jan 12 19:01:57 CET 2023

        System.out.println("mydate.getTime() = " + mydate.getTime());  //1673546410180

        System.out.println("LocalDate.now() = " + LocalDate.now());  //2023-01-12
        System.out.println("LocalTime.now() = " + LocalTime.now());//   19:00:10.244374


        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());// 2023-01-12  19:00:10.244374



    }//main


}
