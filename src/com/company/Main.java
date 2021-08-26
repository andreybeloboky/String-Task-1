package com.company;

public class Main {

    public static void main(String[] args) {
        String str = new String("I like Java!!!");
        System.out.println(str.length());
        System.out.println(str.charAt(13)); // enter letter
        System.out.println(str.endsWith("!!!")); // review ends
        System.out.println(str.startsWith("I like")); // review starts
        System.out.println(str.contains("Java")); // review if a word "Java" in string
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.replace("a", "o")); // replace all letter "a" onto letter "o"
        System.out.println(str.toUpperCase()); // upp all letter
        System.out.println(str.toLowerCase()); // low all letter
        System.out.println(str.substring(0, 6)); // enter letter from and to
    }
}
