import java.lang.*;
import java.util.*;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Welcome  ";

        int len = str.length();
        System.out.println(len);

        String str1 = str.toLowerCase();
        System.out.println(str1);

        String str2 = str.toUpperCase();
        System.out.println(str2);

        String str3 = str.replace('m', 'M');
        System.out.println(str3);

        String str4 = str.trim(); // only trim begining and ending space not trim mid space
        System.out.println(str4);

        String str5 = str.substring(4);
        System.out.println(str5);

        String str6 = str.substring(2, 8); // it will not include 8 only include till 7
        System.out.println(str6);

        boolean b1 = str.startsWith("Wel"); // it checks string strts with www. or not
        System.out.println(b1);

        boolean b2 = str.endsWith("ome"); // it checks string ends with "@gmail.com" or not
        System.out.println(b2);

        boolean b3 = str.equals("Notwelcome");
        System.out.println(b3);

        boolean b4 = str.equalsIgnoreCase("WELCOME"); // it will ignore case like upper case and lower case
        System.out.println(b4);

        int n1 = str.indexOf("Wel");
        System.out.println(n1);

        int n2 = str.indexOf("o");
        System.out.println(n2);

        int n3 = str.lastIndexOf("ome"); // it wil search from last
        System.out.println(n3);

        int n4 = str.lastIndexOf("c");
        System.out.println(n4);

        // compare will checkk which String's character comes first according to dictionary.
        // if fisrt String come first dictionarly than return -1 means first String is Smaller than Second.
        // if both are same but cases are diff than Upper case smaller cause come first in ASCII code.
        String s1 = "java";
        String s2 = "python";

        int n5 = s1.compareTo(s2);
        System.out.println(n5);

        int n6 = s2.compareTo(s1);
        System.out.println(n6);

        String s3 = String.valueOf(12596);
        System.out.println(s3);

        String s4 ="f";
        System.out.println(s4.matches("."));

        String s5 ="f";
        System.out.println(s5.matches("[fgh]"));

        String s6 ="f";
        System.out.println(s6.matches("[^fgh]"));

        String s7 ="s";
        System.out.println(s7.matches("[a-zA-Z]"));

        String s8 ="abc";
        System.out.println(s8.matches("abc")); // for exactly same.

        String s9 ="4";
        System.out.println(s9.matches("\\d"));  // cpatial D for not digit.

        String s10 =" ";
        System.out.println(s10.matches("\\s")); // capital S for not space

        String s11 ="y";
        System.out.println(s11.matches("\\w"));

        String s12 ="8";
        System.out.println(s12.matches("\\w"));

        String s13 ="%";
        System.out.println(s13.matches("\\W")); // capital W for neither Alphabte nor digit.

        String s14 ="abdg";
        System.out.println(s14.matches(".*")); // * --> 0 to any number

        String s15 ="ghfdn";
        System.out.println(s15.matches(".+"));  // + --> min 1 time

        String s16 ="a";
        System.out.println(s16.matches("[abd]?"));  // ? --> 0 or 1 time

        String s17 ="apple";
        System.out.println(s17.matches("[a-z]{5}")); // {x} --> X times

        String s18 ="pineapple";
        System.out.println(s18.matches("[a-z]{5,8}"));

        String s19 ="aaa";
        System.out.println(s19.matches(".{3}"));


        //  lets chech for email verification

        String s20 ="punnu2709@gmail.com";
        System.out.println(s20.matches(".*@gmail.com"));

        // or only alphabates and number

        String s21 ="punnu2709@gmail.com";
        System.out.println(s21.matches("\\w*@gmail.com"));

        String s22 ="punnu&2709@gmail.com";
        System.out.println(s22.matches("\\w*@gmail.com"));




    }

}