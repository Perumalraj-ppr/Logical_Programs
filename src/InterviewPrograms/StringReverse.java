package core_Java.LogicalPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        StringReverse sc = new StringReverse();
        sc.stringReverse_Loop();
        sc.stringReverseBuilder();
        sc.stringReverse_Buffer();
    }

    public  Scanner input = new Scanner(System.in);
    private  void stringReverseBuilder() {
        System.out.println("Reverse using Builder");
        System.out.println("#####################");
        System.out.println("Enter name to reverse : ");
        String name = input.next();
        StringBuilder sb = new StringBuilder(name);
        StringBuilder reverse = sb.reverse();
        System.out.println("Reveresed String : "+ reverse);
    }

    public  void stringReverse_Loop(){
        System.out.println("Reverse using loop");
        System.out.println("##################");
        System.out.println("Enter name to reverse : ");
        String name = input.next();
        String reverse = "";
        char[] toChar = name.toCharArray();
        for (int i = 0; i < toChar.length; i++) {
            reverse = toChar[i] + reverse;
        }
        System.out.println("Reveresed String : "+reverse);
    }

    public void stringReverse_Buffer() {
        System.out.println("Reverse using Buffer");
        System.out.println("#####################");
        System.out.println("Enter name to reverse : ");
        String name = input.next();
        StringBuffer sb = new StringBuffer(name);
        StringBuffer reverse = sb.reverse();
        System.out.println("Reveresed String : "+ reverse);
        input.close();
    }

    
}
