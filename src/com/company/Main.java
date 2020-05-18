package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        alternateString(Arrays.asList("AAAA","BBBBB","ABABABAB","BABABA","AAABBB"));

        System.out.println(superReducedString("baab"));

        System.out.println(camelcase("saveChangesInTheEditor"));
    }


    public static void alternateString(List<String> stringList){


        stringList.forEach(a->{
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = a.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(i+1!=chars.length) {
                    if (chars[i] == chars[i + 1]) {
                        stringBuilder.append("" + chars[i]);
                    }
                }
            }
            System.out.println(stringBuilder.length());
        });
    }

    public static int anagram(String str1, String str2){

        StringBuilder stringBuilder1 = new StringBuilder(str1.toLowerCase());

        String str1Sorted = Stream.of(str1.split("")).sorted().collect(Collectors.joining());
        String str2Sorted = Stream.of(str2.split("")).sorted().collect(Collectors.joining());

        if(str1Sorted.equalsIgnoreCase(str2Sorted)) return 0;
        int count=0;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<str1Sorted.length();i++){
// .....
        }
        return 0;
    }


    static String superReducedString(String s){

       // StringBuffer str = new StringBuffer(s);
        for(int i=1;i<s.length();i++){

            if(s.charAt(i-1)==s.charAt(i)){
                s = s.substring(0,i-1) + s.substring(i+1);
                i=0;
            }
            if(s.isEmpty()){
                return "Empty String";
            }
        }

        return s ;
    }

    static int camelcase(String s){
        String[] sArray = s.split("[A-Z]");

        return sArray.length;
    }
}
