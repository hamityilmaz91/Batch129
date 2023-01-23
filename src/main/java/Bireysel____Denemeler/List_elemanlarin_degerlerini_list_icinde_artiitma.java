package Bireysel____Denemeler;

import java.util.ArrayList;
import java.util.List;

public class List_elemanlarin_degerlerini_list_icinde_artiitma {

    public static void main(String[] args) {


        //Example 2: Bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 artiriniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        for (Integer w : nums) {

            if(w==7) {
                continue;
            }else{

                nums.set(nums.indexOf(w),w+3);


            }

        }
        System.out.println(nums);



    }
}


