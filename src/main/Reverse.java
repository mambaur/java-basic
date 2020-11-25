package main;

public class Reverse {
    public static void main(String[] args) {

        // Reverse using iterative / non recursive
        String text = "Hello world", temp = "";
        for (int i=text.length()-1; i>=0;i--){
            char c = text.charAt(i);
            temp += String.valueOf(c);
        }
        System.out.println(temp);

        System.out.println("==========================");

        // Reverse using recursive
        System.out.println(recursive(text));
    }

    private static String recursive(String text){
        if (text.isEmpty()){
            return text;
        }
        return recursive(text.substring(1)) + text.charAt(0);
    }
}
