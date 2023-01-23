package SSG.Arraylist;

import java.util.ArrayList;

public class Soru6 {

    public static void main(String[] args) {


        // bir list olusturun ve listte kac tane elmanin tekrar ettigini yazdirin

        ArrayList<Integer> list = new ArrayList<>();

        list.add(77);
        list.add(11);
        list.add(55);
        list.add(55);
        list.add(77);
        list.add(7755);
        list.add(11);
        list.add(15);
        list.add(11);

        System.out.println(list);//[77, 11, 55, 55, 77, 7755, 11, 15, 11]

           int counter =0;                         // output sollte sein ==> 77 (2)   11(3)  55(2)
        for (int i =0 ; i<list.size();i++){

            for (int j = 0; j <list.size(); j++) {

                if(list.get(i)==list.get(j)){
                    counter++;

                }


            }
            System.out.println(list.get(i)+" elemanindan"+(counter+1)+"tane var");
            counter=0;



        }

    }



}
