package com.naughtyzombie.sentencewordcount;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pram on 26/07/2015.
 */
public class SentenceWordCount {
    public static void main(String[] args) {
        SentenceWordCount swc = new SentenceWordCount();
        Map<String, Integer> wordCountMap = swc.count("It is of course just what I can do and probably bad way. When I run the code, I get sometimes out of array exeption and sometimes it runs. What is missing is: go through all words and check them and skip the words which were already counted. I will be happy to get any help with this so can move along and understand how it can be coded. Thank you :)");

        for (String word : wordCountMap.keySet()) {
            System.out.println(word + " - " + wordCountMap.get(word));
        }
    }

    private Map count(String s) {
        String[] words = s.toLowerCase().split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();

        for (String word : words) {
            Integer count = wordCounts.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounts.put(word, count + 1);
        }

        return wordCounts;
    }
}
