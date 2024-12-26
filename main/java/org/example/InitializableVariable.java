package org.example;

public class InitializableVariable {
    public static void main(String[] args) {

        V1 v1=new V1();
        System.out.println("v1 value:"+v1.value);
        System.out.println();

//        V2 v2=new V2();
//        System.out.println("v2 value:"+v2.value);
//        System.out.println();

    }
}

class V1 {
static int staticValue=30;
int value=11;
String word="threat";
}

class V2 {
    int value;
    String word;

    public V2(int value, String word) {
        this.value = value;
        this.word = word;
    }
}
    class V3{
        static int staticValue;
        int value;
        String word;

        static {
            if(true) {
                staticValue=30;
            } else {
                staticValue=50;
            }
        }

        {
            if(true) {this.value=11;}
            else{this.value=12;}
        }
    }
