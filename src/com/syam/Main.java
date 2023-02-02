package com.syam;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("vani");
        sb.append("nalini");
        System.out.println(sb);
        // write your code here
    }
}


class ga {
    public static void main(String[] args) {
        String s = "sravani pravallika pandranki";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

class vahini {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("sravani");
        sb.append("pandranki");
        System.out.println(sb);

    }
}

class gat {
    public static void main(String[] args) {
        String s = "teryuerfiuehfugfyuefvygd wudhweoihuewegewgeb gfeugfegfe grfgwuiegrfiw";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('i'));
        System.out.println(s.lastIndexOf('i'));
        System.out.println(s.replace('e', 's'));
    }
}

class rk{
    public static void main(String[] args) {
        String s="sravani is a good girl";
        String s1="syam is a good girl";
        System.out.println(s);
        System.out.println(s1);
        if(s==s1){
            System.out.println("references are equal");}else{
            System.out.println("references are not equal");}
        String s2=" ";
        String s3=s.concat(s1);
            System.out.println(s3);
            if(s.equals(s2)){
                System.out.println("values are equal");}else{
                System.out.println("values are not equal");}
            if(s.equalsIgnoreCase(s1)){
                System.out.println("igonring");}else{
                System.out.println("not ignoring");}
    }
}