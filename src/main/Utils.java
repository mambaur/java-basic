package main;

import java.util.*;

public class Utils {
    public static void main(String[] args) {

        /*
         * String to array char
         * Output :
         * [H, e, l, l, o,  , w, o, r, l, d]
         */
        String s = "Hello world";
        char[] sArray = s.toCharArray();
        System.out.println(Arrays.toString(sArray));


        /*
         * Array Sort
         * Output :
         * [ , H, d, e, l, l, l, o, o, r, w]
         */
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));


        /*
         * Foreach array
         * Output :
         *  Hdellloorw
         */
        for (char i: sArray) {
            System.out.print(i);
        }


        /*
         * Foreach List<String>
         * Output :
         * A
         * B
         * C
         */
        List<String> someList = new ArrayList<String>();
        someList.add("A");
        someList.add("B");
        someList.add("C");

        someList.forEach(index ->{
            System.out.println(index);
        });



        /*
         * Foreach key-value
         * Output :
         * Key : Key2 Value : Value2
         * Key : Key1 Value : Value1
         * Key : Key3 Value : Value3
         */
        Map<String, String> mapList = new HashMap<>();
        mapList.put("Key1", "Value1");
        mapList.put("Key2", "Value2");
        mapList.put("Key3", "Value3");
        mapList.forEach((key,value)->{
            System.out.println("Key : " + key + " Value : " + value);
        });
    }
}
