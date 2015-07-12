package com.naughtyzombie.HashMapPerformance;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates a bad hashCode, only the first name is used when calculating the hashCode.
 */
public class HashMapPerformanceTutorial {

    /**
     * Demonstrates a bad hashCode, only the first name is used when calculating the hashCode.
     */
    public static final void main(String argv[]) {
        Map<PersonKey, Integer> people = new HashMap<PersonKey, Integer>();

        /* The following three puts, are all stored at the same internal bucket, because they all have "Bill" as
           the first name. */
        people.put(new PersonKey("Bill", "Smith", LocalDate.of(1990, Month.DECEMBER, 12)), 29);
        
        people.put(new PersonKey("Bill", "Johnson", LocalDate.of(1991, Month.DECEMBER, 1)), 30);
        
        people.put(new PersonKey("Bill", "Jackson", LocalDate.of(1992, Month.DECEMBER, 2)), 31);

        int age = people.get(new PersonKey("Bill", "Smith", LocalDate.of(1990, Month.DECEMBER, 12)));
        System.out.println(age);
    }
}