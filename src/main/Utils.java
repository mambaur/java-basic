package main;

import java.util.*;

public class Utils {
    public static void main(String[] args) {

        // String to char array ------------------
        String s = "Hello world";
        char[] sArray = s.toCharArray();
        System.out.println(Arrays.toString(sArray));
        /*
         * Output :
         * [H, e, l, l, o,  , w, o, r, l, d]
         */


        // Array sort -----------------------------
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        /*
         * Output :
         * [ , H, d, e, l, l, l, o, o, r, w]
         */


        // Foreach array --------------------------
        for (char i: sArray) {
            System.out.print(i);
        }
        /*
         * Output :
         *  Hdellloorw
         */


        // Foreach List<String> -------------------
        List<String> someList = new ArrayList<String>();
        someList.add("A");
        someList.add("B");
        someList.add("C");

        someList.forEach(index ->{
            System.out.println(index);
        });
        /*
         * Output :
         * A
         * B
         * C
         */


        // Foreach key-value ----------------------
        Map<String, String> mapList = new HashMap<>();
        mapList.put("Key1", "Value1");
        mapList.put("Key2", "Value2");
        mapList.put("Key3", "Value3");
        mapList.forEach((key,value)->{
            System.out.println("Key : " + key + " Value : " + value);
        });
        /*
         * Output :
         * Key : Key2 Value : Value2
         * Key : Key1 Value : Value1
         * Key : Key3 Value : Value3
         */
    }
}
