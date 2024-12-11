package String;

import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String k="Jara";
        System.out.println("jara length:"+k.length());
        int ss=0;
        for(int i=0;i<k.length();i++) {
            if (k.charAt(i) == 'a') {
                ss += 1;
            }
        }
        System.out.println("ss:"+ss);

        String vowel="aeiou";
        int count=0;
           for(char c:k.toLowerCase().toCharArray()) {
        if(vowel.contains(String.valueOf(c))) { //
            count+=1;
        }
           }
        System.out.println("count of vowels:"+count);
    }


}
