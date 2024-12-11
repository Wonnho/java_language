package String;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {

        String word1=new String("String object");
        String word2=new String("String object");
        System.out.println("word1:"+System.identityHashCode(word1));
        System.out.println("Java"+2024);
        System.out.println(1+1+"1");
        String word="      banana   Republic     ";
        System.out.println(word.length());

        String str="";
        String str2="        ";
        System.out.println("str:"+str.isEmpty());
        System.out.println("str1:"+str2.isEmpty());

        String str3="\n";
        System.out.println("str:"+str.isBlank());
        System.out.println("str2"+str2.isBlank());
        System.out.println("str3"+str3.isBlank());


        System.out.println(word.charAt(2));
        System.out.println(word.charAt(7));

        char[] characters=word.toCharArray();
        System.out.println(Arrays.toString(characters));

        for(char character:characters) {
            String str4=String.valueOf(character);
            System.out.println(str4);

            System.out.println(word.contains("pu"));

            System.out.println(word.indexOf("R"));

            String str5=new String("     Arena law     ");
            System.out.println(str5.trim());

            System.out.println(str5.replace("Arena","Martial"));
            System.out.println(word.substring(7,12));
            System.out.println(Arrays.toString(str5.split("  ")));

        }
    }


}
