package com.frameium.pageobject.UFS;

import java.util.LinkedHashMap;
import java.util.Map;

public class practice3 {
    public static void main(String args[]) {
        dupli();
    }

    public static void dupli() {
        String a = "THEEARTHISBEAUTIFUL";
        //String b=a.substring(a.length()-4,a.length());
        //  System.out.println(b);
        Map<Character, Integer> map = new LinkedHashMap<>();
        char c[] = a.toCharArray();
        System.out.println("he");
        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() ==1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
                break;
            }


        }
    }

    public static void nondupli() {
        String a = "THEEARTHISBEAUTIFUL";
        //String b=a.substring(a.length()-4,a.length());
        //  System.out.println(b);
        Map<Character, Integer> map = new LinkedHashMap<>();
        char c[] = a.toCharArray();
        System.out.println("he");
        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int keyfound=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
           if(entry.getValue()==1){
               keyfound=entry.getKey();
              if( keyfound!=0){
                  System.out.println(keyfound);
                  break;
               }
            }

        }


    }
}