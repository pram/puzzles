package com.naughtyzombie.ci.dataandstrings.stringcompress;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pram on 02/07/2015.
 */
public class StringCompress {
    public static void main(String[] args) {
        String str = "abbccccccde";
        StringCompress sc = new StringCompress();
        String out = sc.compress(str);
        System.out.println(out);
    }

    private String compress(String str) {
        String[] split = str.split("");
        Set<String> charSet = new HashSet<>(split.length);
        StringBuilder sb = new StringBuilder(split.length);

        for (String x : split) {
            if (!charSet.contains(x)) {
                charSet.add(x);

                int count = str.length() - str.replace(x, "").length();
                sb.append(x);
                sb.append(count);
            }
        }


        return sb.toString();
    }
}
