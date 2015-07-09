package com.naughtyzombie.prefixsuffix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by pram on 09/07/2015.
 */
public class PrefixSuffix {
    public static void main(String[] args) {
        String input = "abbabba";
        char[] chars = input.toCharArray();
        List<String> prefixSet = new ArrayList<>(chars.length);
        List<String> suffixSet = new ArrayList<>(chars.length);

        for (int i = 1; i < chars.length; i++) {
            char prefixChar = chars[(chars.length - 1) - i];
            char suffixChar = chars[i];
            prefixSet.add(String.valueOf(Arrays.copyOfRange(chars,0,chars.length - i)));
            suffixSet.add(String.valueOf(Arrays.copyOfRange(chars,i,chars.length)));
        }

        prefixSet.retainAll(suffixSet);

        String s = prefixSet.stream().max(Comparator.comparing(item -> item.length())).get();

        System.out.println(s);

    }
}
